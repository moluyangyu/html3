package main.java.com.example.htlm3.service.serviceImpl;

import main.java.com.example.htlm3.dao.daoimpl.staffDaoImpl;
import main.java.com.example.htlm3.dao.staffDao;
import main.java.com.example.htlm3.entity.Staff;
import main.java.com.example.htlm3.service.staffService;

import java.sql.SQLException;
import java.util.List;

public class staffServiceImpl implements staffService {
    @Override
    public List<Staff> getstaffList()throws SQLException,ClassNotFoundException {
        staffDao staffDao=new staffDaoImpl();
        List<Staff> staffList=staffDao.getstaffList();
        staffDao.closeResource();
        return  staffList;
    }

    @Override
    public Staff getstaffById(int id)throws SQLException,ClassNotFoundException {
        staffDao staffDao=new staffDaoImpl();
        Staff staff=new Staff();
        staff=staffDao.getStaffById(id);
        staffDao.closeResource();
        return staff;
    }

    @Override
    public void addStaff(String name, int id, int age, String project) throws SQLException,ClassNotFoundException{
        staffDao staffDao=new staffDaoImpl();
        staffDao.addStaff(name,id,age,project);
        staffDao.closeResource();
    }

    @Override
    public void deleteStaffById(int id) throws SQLException,ClassNotFoundException{
        staffDao staffDao=new staffDaoImpl();
        staffDao.deleteStaffById(id);
        staffDao.closeResource();
    }

    @Override
    public void updateStaff(String name, int id, int age, String project)throws SQLException,ClassNotFoundException{
        staffDao staffDao=new staffDaoImpl();
        staffDao.updateStaff(name,id,age,project);
        staffDao.closeResource();
    }
}
