package main.java.com.example.htlm3.service;

import main.java.com.example.htlm3.entity.Staff;

import java.util.List;

public interface staffService {
    //获取所有人员信息  id name 负责的项目：project 年龄：age
    public List<Staff> getstaffList() ;

}
