package main.java.com.example.htlm3.dao.daoimpl;

import main.java.com.example.htlm3.dao.userDao;
import main.java.com.example.htlm3.entity.user;

import java.sql.SQLException;
import java.time.LocalDate;

public class userDaoImpl extends baseDaoImpl implements userDao {
    @Override
    public user login(String username, String password) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="SELECT * from yonghu where name = ? and password = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1,username);
        ps.setString(2,password);
        rs=ps.executeQuery();
        user user=null;
        if(rs.next()){
            user=new user();
            user.setUsername(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            user.setId(rs.getInt("id"));
        }
        return user;
    }

    @Override
    public void AddService(user user) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="SELECT COUNT(*) AS total_rows FROM \"my_gauss\".\"yonghu\"";
        ps = con.prepareStatement(sql);
        rs=ps.executeQuery();
        if(rs.next()){
            int i= rs.getInt("total_rows");
            i++;
            LocalDate currentDate = LocalDate.now();
            String sql1="INSERT INTO yonghu (id,name,password)VALUES(?,?,?)";
            ps = con.prepareStatement(sql1);
            ps.setInt(1,user.getId());
            ps.setString(2,user.getUsername());
            ps.setString(3,user.getPassword());
        }
    }
    }
}
