package main.java.com.example.htlm3.service;

import main.java.com.example.htlm3.entity.user;

import java.sql.SQLException;

public interface userService {
    public user login(String username,String password) throws SQLException;
    public void  AddUser(String username,String password) throws  SQLException;
}
