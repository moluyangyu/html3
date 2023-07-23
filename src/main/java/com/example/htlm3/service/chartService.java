package main.java.com.example.htlm3.service;

import main.java.com.example.htlm3.entity.Integer;

import java.sql.SQLException;
import java.util.List;

public interface chartService {
       public List<Integer> getdata()throws SQLException,ClassNotFoundException;
}
