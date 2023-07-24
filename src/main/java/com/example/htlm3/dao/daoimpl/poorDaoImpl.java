package main.java.com.example.htlm3.dao.daoimpl;

import main.java.com.example.htlm3.dao.poorDao;
import main.java.com.example.htlm3.entity.Poor;
import main.java.com.example.htlm3.entity.Staff;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class poorDaoImpl extends baseDaoImpl implements poorDao {
    @Override
    public boolean Add(String family, String level, String name) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="SELECT * from \"my_gauss\".\"Poor\" where id = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1,0);
        rs=ps.executeQuery();
        if(rs.next()){
            int i= rs.getInt("number");
            i++;
            LocalDate currentDate = LocalDate.now();
            String sql1="INSERT INTO \"my_gauss\".\"Poor\" (id,name,familysituation,povertylevel,filingtime)VALUES(?,?,?,?,?)";
            ps = con.prepareStatement(sql1);
            ps.setInt(1,i);
            ps.setString(2,name);
            ps.setString(3,family);
            ps.setString(4,level);
            ps.setDate(5, Date.valueOf(currentDate));
            ps.executeUpdate();
            String sql2="UPDATE \"my_gauss\".\"Poor\" SET number = ? WHERE id = 0";
            ps=con.prepareStatement(sql2);
            ps.setInt(1,i);
            ps.executeUpdate();
            return true;
        }
        return false;

    }

    @Override
    public boolean ChangeFamily(String family,int id) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="UPDATE \"my_gauss\".\"Poor\" SET familysituation = ? WHERE id = ?";
        ps=con.prepareStatement(sql);
        ps.setString(1,family);
        ps.setInt(2,id);
        ps.executeUpdate();
        String sql1="SELECT * from \"my_gauss\".\"Poor\" where id = ?";
        ps=con.prepareStatement(sql1);
        ps.setInt(1,id);
        rs=ps.executeQuery();
        String a=rs.getString("FamilySituation");
        if(family.equalsIgnoreCase(a)){
            return  true;
        }
        return false;
    }

    @Override
    public boolean ChangeLevel(String level,int id) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="UPDATE \"my_gauss\".\"Poor\" SET povertylevel = ? WHERE id = ?";
        ps=con.prepareStatement(sql);
        ps.setString(1,level);
        ps.setInt(2,id);
        ps.executeUpdate();
        String sql1="SELECT * from \"my_gauss\".\"Poor\" where id = ?";
        ps=con.prepareStatement(sql1);
        ps.setInt(1,id);
        rs=ps.executeQuery();
        String a=rs.getString("PovertyLevel");
        if(level.equalsIgnoreCase(a)){
            return  true;
        }
        return false;
    }

    @Override
    public boolean ChangeName(String name,int id) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="UPDATE \"my_gauss\".\"Poor\" SET name = ? WHERE id = ?";
        ps=con.prepareStatement(sql);
        ps.setString(1,name);
        ps.setInt(2,id);
        ps.executeUpdate();
        String sql1="SELECT * from \"my_gauss\".\"Poor\" where id = ?";
        ps=con.prepareStatement(sql1);
        ps.setInt(1,id);
        rs=ps.executeQuery();
        String a=rs.getString("name");
        if(name.equalsIgnoreCase(a)){
            return  true;
        }
        return false;
    }

    @Override
    public boolean Delete(int id) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="DELETE FROM \"my_gauss\".\"Poor\" WHERE id = ?";
        ps=con.prepareStatement(sql);
        ps.setInt(1,id);
        ps.executeUpdate();
        String sql1="SELECT * from \"my_gauss\".\"Poor\" where id = ?";
        ps=con.prepareStatement(sql1);
        ps.setInt(1,id);
        rs=ps.executeQuery();
        if(rs.next()==false){
            return  true;
        }
        return false;
    }

    @Override
    public List<Poor> GetAll() throws SQLException, ClassNotFoundException {
        openDb();
        String sql="SELECT * FROM \"my_gauss\".\"Poor\"";
        ps=con.prepareStatement(sql);
        rs= ps.executeQuery();
        List<Poor> poors=new ArrayList<>();
        while (rs.next()){
            Poor poor=new Poor();
            poor.setId(rs.getInt("id"));
            poor.setFamilySituation(rs.getString("FamilySituation"));
            poor.setName(rs.getString("name"));
            poor.setPoorLevel(rs.getString("PovertyLevel"));
            poors.add(poor);
        }
        return poors;
    }

    @Override
    public Poor getpoorById(int id) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="SELECT * from \"my_gauss\".\"Poor\" where id = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1,id);
        rs=ps.executeQuery();
        Poor poor=new Poor();
        if(rs.next()){
            poor.setPoorLevel(rs.getString("povertylevel"));
            poor.setName(rs.getString("name"));
            poor.setFamilySituation(rs.getString("familysituation"));
            poor.setId(rs.getInt("id"));
        }
        return poor;
    }
}
