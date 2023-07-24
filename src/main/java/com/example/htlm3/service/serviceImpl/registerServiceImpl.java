package main.java.com.example.htlm3.service.serviceImpl;

import main.java.com.example.htlm3.dao.daoimpl.userDaoImpl;
import main.java.com.example.htlm3.dao.userDao;
import main.java.com.example.htlm3.entity.user;
import main.java.com.example.htlm3.service.registerService;

import java.sql.SQLException;

public class registerServiceImpl implements registerService {
    @Override
    public void addService(String username,String passowrd) throws SQLException, ClassNotFoundException {
        userDao userDao=new userDaoImpl();
        user user=new user();
        user.setUsername(username);
        user.setPassword(passowrd);
        userDao.AddService(user);
        userDao.closeResource();;

    }
}
