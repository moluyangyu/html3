package main.java.com.example.htlm3.dao.daoimpl;

import main.java.com.example.htlm3.dao.staffDao;
import main.java.com.example.htlm3.entity.Poor;
import main.java.com.example.htlm3.entity.Staff;
import main.java.com.example.htlm3.entity.user;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class staffDaoImpl extends baseDaoImpl implements staffDao {
    @Override
    public List<Staff> getstaffList() throws SQLException, ClassNotFoundException {
        openDb();
        String sql="SELECT * FROM \"my_gauss\".\"Staff\"";
        ps=con.prepareStatement(sql);
        rs= ps.executeQuery();
        List<Staff> staffs=new ArrayList<>();
        while (rs.next()){
            Staff staff=new Staff();
            staff.setAge(rs.getInt("age"));
            staff.setId(rs.getInt("id"));
            staff.setName(rs.getString("name"));
            staff.setProject(rs.getString("project"));
            staffs.add(staff);
        }
        return staffs;
    }

    @Override
    public Staff getStaffById(int id) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="SELECT * from staff where id = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1,id);
        rs=ps.executeQuery();
        Staff staff=null;
        if(rs.next()){
            staff=new Staff();
            staff.setName(rs.getString("name"));
            staff.setProject(rs.getString("project"));
            staff.setAge(rs.getInt("age"));
        }
        return staff;
    }

    @Override
    public void addStaff(String name, int id, int age, String project) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="SELECT COUNT(*) AS total_rows FROM \"my_gauss\".\"staff\"";
        ps = con.prepareStatement(sql);
        rs=ps.executeQuery();
        if(rs.next()){
            int i= rs.getInt("total_rows");
            i++;
            LocalDate currentDate = LocalDate.now();
            String sql1="INSERT INTO yonghu (id,name,project,age)VALUES(?,?,?,?)";
            ps = con.prepareStatement(sql1);
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setString(3,project);
            ps.setInt(4,age);
        }
    }



    @Override
    public void deleteStaffById(int id) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="DELETE FROM staff WHERE id = ?";
        ps=con.prepareStatement(sql);
        ps.setInt(1,id);
    }

    @Override
    public void updateStaff(String name, int id, int age, String project) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="UPDATE poor SET name = ?,age = ?,project = ? WHERE id = ?";
        ps=con.prepareStatement(sql);
        ps.setString(1,name);
        ps.setInt(2,age);
        ps.setString(3,project);
        ps.setInt(4,id);
    }
}
