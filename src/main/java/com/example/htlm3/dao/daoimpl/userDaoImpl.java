package main.java.com.example.htlm3.dao.daoimpl;

import main.java.com.example.htlm3.dao.userDao;
import main.java.com.example.htlm3.entity.user;

import java.sql.SQLException;

public class userDaoImpl extends baseDaoImpl implements userDao {
    @Override
    public user login(String username, String password) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="SELECT * from tuser where name = ? and password = ?";
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
}
