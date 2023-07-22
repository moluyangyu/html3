package main.java.com.example.htlm3.service.serviceImpl;

import main.java.com.example.htlm3.dao.daoimpl.poorDaoImpl;
import main.java.com.example.htlm3.dao.poorDao;
import main.java.com.example.htlm3.service.poorService;

import java.sql.SQLException;

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
}
