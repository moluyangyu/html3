package main.java.com.example.htlm3.service.serviceImpl;

import main.java.com.example.htlm3.dao.commentDao;
import main.java.com.example.htlm3.dao.daoimpl.commentDaoImpl;
import main.java.com.example.htlm3.entity.Comment;
import main.java.com.example.htlm3.service.commentService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class commentServiceImpl implements commentService {
    @Override
    public void addComment(Comment comment) throws SQLException,ClassNotFoundException {
        commentDao commentDao=new commentDaoImpl();
        commentDao.addComment(comment);
    }

    @Override
    public List<Comment> getComments() throws SQLException,ClassNotFoundException{
        commentDao commentDao=new commentDaoImpl();
        List<Comment> comments=new ArrayList<>();
        comments=commentDao.getComments();
        commentDao.closeResource();
        return comments;
    }
}
