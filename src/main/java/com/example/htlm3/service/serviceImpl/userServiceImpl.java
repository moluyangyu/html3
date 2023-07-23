package main.java.com.example.htlm3.service.serviceImpl;

import main.java.com.example.htlm3.dao.daoimpl.userDaoImpl;
import main.java.com.example.htlm3.dao.userDao;
import main.java.com.example.htlm3.entity.user;
import main.java.com.example.htlm3.service.userService;

import java.sql.SQLException;

public class userServiceImpl implements userService {
    @Override
    public user login(String username, String password) throws SQLException{
        userDao userDao = new userDaoImpl();
        user user = null;
        try {
            user = userDao.login(username,password);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            userDao.closeResource();
        }
        return user;
    }

    @Override
    public void AddUser(String username, String password) throws SQLException {

    }
}
