package main.java.com.example.htlm3.service;

import java.sql.SQLException;

public interface poorService {
    //增加函数，变量分别为(家庭状况，户主姓名，贫困程度),会返回是否加载成功
    public boolean Add(String family,String name,String level) throws SQLException, ClassNotFoundException;
}