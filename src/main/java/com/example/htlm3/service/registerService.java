package main.java.com.example.htlm3.service;

import java.sql.SQLException;

public interface registerService {
    //将注册信息同步到数据库
    public void addService(String username,String password)throws SQLException,ClassNotFoundException;

}
