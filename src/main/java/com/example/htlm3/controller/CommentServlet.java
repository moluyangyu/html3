package main.java.com.example.htlm3.controller;


import main.java.com.example.htlm3.entity.Comment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/commentServlet")
public class CommentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String message = request.getParameter("message");

        // 创建评论对象
        Comment comment = new Comment(0, username, message);

        // 获取评论管理器对象
        CommentManager commentManager = new CommentManager();

        // 添加评论
        commentManager.addComment(comment);

        // 重定向到评论页面
        response.sendRedirect("contact.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}