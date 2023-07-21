package main.java.com.example.htlm3.dao;

import main.java.com.example.htlm3.entity.user;

import java.sql.SQLException;

public interface userDao extends baseDao {
    public user login(String username, String password) throws SQLException, ClassNotFoundException;
}
