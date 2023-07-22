package main.java.com.example.htlm3.dao;

import java.sql.SQLException;

public interface poorDao extends baseDao{
    public boolean Add(String family,String level,String name) throws SQLException, ClassNotFoundException;
    public boolean ChangeFamily(String family,int id)throws  SQLException,ClassNotFoundException;
    public boolean ChangeLevel(String level,int id)throws  SQLException,ClassNotFoundException;
    public boolean ChangeName(String name,int id)throws  SQLException,ClassNotFoundException;
    public boolean Delete(int id)throws  SQLException,ClassNotFoundException;

}
