package main.java.com.example.htlm3.dao;

import java.sql.SQLException;

public interface baseDao {
    public void openDb() throws SQLException, ClassNotFoundException;
    public void closeResource() throws SQLException;
    public void openTransaction() throws SQLException, ClassNotFoundException;
    public void commitTransaction() throws SQLException;
    public void rollbackTransaction() throws SQLException;
}
