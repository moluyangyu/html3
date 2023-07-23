package com.example.htlm3.entity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CommentManager {
    private Connection connection;

    public CommentManager() {
        // 初始化数据库连接
        try {
            // 加载数据库驱动
            Class.forName("org.postgresql.Driver");
            // 建立数据库连接
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/my_gauss", "my_gauss", "my_gauss@123");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // 添加评论
    public void addComment(Comment comment) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO comments (id, username, message) VALUES (?, ?, ?)");
            statement.setInt(1, comment.getId());
            statement.setString(2, comment.getUsername());
            statement.setString(3, comment.getMessage());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 获取所有评论
    public List<Comment> getComments() {
        List<Comment> comments = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM comments");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String message = resultSet.getString("message");
                Comment comment = new Comment(id, username, message);
                comments.add(comment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return comments;
    }
}