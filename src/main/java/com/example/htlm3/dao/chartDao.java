package main.java.com.example.htlm3.dao;

import java.sql.SQLException;
import java.util.List;

public interface chartDao extends baseDao{
    public List<Integer> getdata()throws SQLException,ClassNotFoundException;
}
