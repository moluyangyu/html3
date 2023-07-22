package main.java.com.example.htlm3.dao;

import java.sql.SQLException;

public interface poorDao extends baseDao{
    public boolean Add(String family,String level,String name) throws SQLException, ClassNotFoundException;
    public boolean ChangeFamily(String family)throws  SQLException,ClassNotFoundException;
    public boolean ChangeLevel(String level)throws  SQLException,ClassNotFoundException;
    public boolean ChangeName(String name)throws  SQLException,ClassNotFoundException;
    public boolean Delete(String name)throws  SQLException,ClassNotFoundException;

}
