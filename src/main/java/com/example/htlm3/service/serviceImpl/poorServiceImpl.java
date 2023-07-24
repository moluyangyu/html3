package main.java.com.example.htlm3.service.serviceImpl;

import main.java.com.example.htlm3.dao.daoimpl.poorDaoImpl;
import main.java.com.example.htlm3.dao.poorDao;
import main.java.com.example.htlm3.entity.Poor;
import main.java.com.example.htlm3.service.poorService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class poorServiceImpl implements poorService {
    @Override
    public boolean Add(String family, String name, String level) throws SQLException, ClassNotFoundException {
        poorDao poorDao=new poorDaoImpl();
        boolean a= poorDao.Add(family,level,name);
        if(a==true){
            poorDao.closeResource();
            return true;
        }
        return false;
    }

    @Override
    public boolean Delete(int id) throws SQLException, ClassNotFoundException {
        poorDao poorDao=new poorDaoImpl();
        boolean a=poorDao.Delete(id);
        if(a==true){
            poorDao.closeResource();
            return  true;
        }
        return  false;

    }

    @Override
    public boolean ChangeLevel(String level,int id) throws SQLException, ClassNotFoundException {
        poorDao poorDao=new poorDaoImpl();
        boolean a=poorDao.ChangeLevel(level,id);
        if(a==true){
            poorDao.closeResource();
            return  true;
        }
        return  false;
    }

    @Override
    public boolean ChangeFamily(String family,int id) throws SQLException, ClassNotFoundException {
        poorDao poorDao=new poorDaoImpl();
        boolean a=poorDao.ChangeFamily(family,id);
        if(a==true){
            poorDao.closeResource();
            return  true;
        }
        return  false;
    }

    @Override
    public boolean ChangeName(String name,int id) throws SQLException, ClassNotFoundException {
        poorDao poorDao=new poorDaoImpl();
        boolean a=poorDao.ChangeFamily(name,id);
        if(a==true){
            poorDao.closeResource();
            return  true;
        }
        return  false;
    }

    @Override
    public List<Poor> GetAll() throws SQLException, ClassNotFoundException {
        poorDao poorDao=new poorDaoImpl();
        List<Poor> poors;
        poors=poorDao.GetAll();
        poorDao.closeResource();
        return  poors;
    }

    @Override
    public Poor getpoorById(int id) throws SQLException, ClassNotFoundException {
        poorDao poorDao=new poorDaoImpl();
        Poor poor=new Poor();
        poor=poorDao.getpoorById(id);
        poorDao.closeResource();
        return  poor;
    }
}
