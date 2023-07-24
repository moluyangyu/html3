package main.java.com.example.htlm3.service.serviceImpl;

import main.java.com.example.htlm3.dao.chartDao;
import main.java.com.example.htlm3.dao.daoimpl.chartDaoImpl;
import main.java.com.example.htlm3.entity.Integer;
import main.java.com.example.htlm3.service.chartService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class chartServiceImpl implements chartService {
    @Override
    public List<Integer> getdata()throws SQLException,ClassNotFoundException {
        chartDao chartDao=new chartDaoImpl();
        List<Integer> aaa=new ArrayList<>();
        aaa=chartDao.getdata();
        chartDao.closeResource();
        return  aaa;
    }
}
