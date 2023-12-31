package main.java.com.example.htlm3.dao;

import main.java.com.example.htlm3.entity.Poor;

import java.sql.SQLException;
import java.util.List;

public interface poorDao extends baseDao{
    public boolean Add(String family,String level,String name) throws SQLException, ClassNotFoundException;
    public boolean ChangeFamily(String family,int id)throws  SQLException,ClassNotFoundException;
    public boolean ChangeLevel(String level,int id)throws  SQLException,ClassNotFoundException;
    public boolean ChangeName(String name,int id)throws  SQLException,ClassNotFoundException;
    public boolean Delete(int id)throws  SQLException,ClassNotFoundException;
    public List<Poor> GetAll()throws  SQLException,ClassNotFoundException;

    Poor getpoorById(int id)throws SQLException,ClassNotFoundException;
}
