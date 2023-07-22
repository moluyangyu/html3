package main.java.com.example.htlm3.dao.daoimpl;

import main.java.com.example.htlm3.dao.poorDao;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class poorDaoImpl extends baseDaoImpl implements poorDao {
    @Override
    public boolean Add(String family, String level, String name) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="SELECT * from Poor where id = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1,0);
        rs=ps.executeQuery();
        if(rs.next()){
            int i= rs.getInt("number");
            i++;
            LocalDate currentDate = LocalDate.now();
            String sql1="INSERT INTO Poor (id,name,FamilySituation,PovertyLevel,FilingTIme)VALUES(?,?,?,?,?)";
            ps = con.prepareStatement(sql1);
            ps.setInt(1,i);
            ps.setString(2,name);
            ps.setString(3,family);
            ps.setString(4,level);
            ps.setDate(5, Date.valueOf(currentDate));
            return true;
        }
        return false;

    }

    @Override
    public boolean ChangeFamily(String family) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean ChangeLevel(String level) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean ChangeName(String name) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean Delete(String name) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="DELETE FROM poor WHERE name = ?";
        ps=con.prepareStatement(sql);
        ps.setString(1,name);
        String sql1="SELECT * from Poor where name = ?";
        ps=con.prepareStatement(sql1);
        ps.setString(1,name);
        rs=ps.executeQuery();
        if(rs.next()==false){
            return  true;
        }
        return false;
    }
}
