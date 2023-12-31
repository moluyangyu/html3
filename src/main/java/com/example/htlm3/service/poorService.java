package main.java.com.example.htlm3.service;

import main.java.com.example.htlm3.entity.Poor;

import java.sql.SQLException;
import java.util.List;

public interface poorService {
    //增加函数，变量分别为(家庭状况，户主姓名，贫困程度),会返回是否加载成功
    public boolean Add(String family,String name,String level) throws SQLException, ClassNotFoundException;
    //删除用函数，需要id作为删除的依据，函数会返回删除是否成功的结果
    public boolean Delete(int id)throws  SQLException,ClassNotFoundException;
    //下面三个是对应的修改用的函数，直接调用传入参数就行了，同样是会返回是否成功的结果、
    public boolean ChangeLevel(String level,int id)throws  SQLException,ClassNotFoundException;
    public boolean ChangeFamily(String family,int id)throws  SQLException,ClassNotFoundException;
    public boolean ChangeName(String name,int id)throws  SQLException,ClassNotFoundException;
    //获得所有贫困户信息
    public List<Poor> GetAll()throws  SQLException,ClassNotFoundException;
    public Poor getpoorById(int id)throws SQLException,ClassNotFoundException;
}
