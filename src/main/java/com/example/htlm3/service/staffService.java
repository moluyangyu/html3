package main.java.com.example.htlm3.service;

import main.java.com.example.htlm3.entity.Staff;

import java.sql.SQLException;
import java.util.List;

public interface staffService {
    //获取所有人员信息  id name 负责的项目：project 年龄：age
    public List<Staff> getstaffList()throws SQLException,ClassNotFoundException;
    public Staff getStaffById(int id)throws SQLException,ClassNotFoundException;
    public void addStaff(String name,int id,int age,String project)throws SQLException,ClassNotFoundException;
public void deleteStaffById(int id)throws SQLException,ClassNotFoundException;
    public void updateStaff(String name,int id,int age,String project)throws SQLException,ClassNotFoundException;

}
