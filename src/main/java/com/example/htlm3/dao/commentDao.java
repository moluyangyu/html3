package main.java.com.example.htlm3.dao;

import main.java.com.example.htlm3.entity.Comment;

import java.sql.SQLException;
import java.util.List;

public interface commentDao extends baseDao{
    // 添加评论
    public void addComment(Comment comment) throws SQLException,ClassNotFoundException;
    // 获取所有评论
    public List<Comment> getComments()throws SQLException,ClassNotFoundException;

}
