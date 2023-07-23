package main.java.com.example.htlm3.dao.daoimpl;

import main.java.com.example.htlm3.dao.chartDao;
import main.java.com.example.htlm3.entity.Integer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class chartDaoImpl extends baseDaoImpl implements chartDao {
    @Override
    public List<Integer> getdata() throws SQLException, ClassNotFoundException {
        openDb();
        String sql="SELECT * FROM \"my_gauss\".\"shuju\"";
        ps=con.prepareStatement(sql);
        rs= ps.executeQuery();
        List<Integer> integers=new ArrayList<>();
        while (rs.next()){
            Integer integer=new Integer();
            integer.setRen(rs.getInt("ren"));
            integer.setYear(rs.getInt("year"));
            integers.add(integer);
        }
        return integers;
    }
}
