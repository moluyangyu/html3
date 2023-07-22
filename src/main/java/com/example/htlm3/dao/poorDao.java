package main.java.com.example.htlm3.dao;

import java.sql.SQLException;

public interface poorDao extends baseDao{
    public boolean Add(String family,String level,String name) throws SQLException, ClassNotFoundException;
}
