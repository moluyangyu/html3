package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.service.registerService;
import main.java.com.example.htlm3.service.serviceImpl.registerServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 获取用户输入的用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        // 检查密码是否一致


        // 保存用户信息到数据库或其他存储中
        registerService registerService = new registerServiceImpl() {
        } ;
       // registerService.addService();

        try {
            registerService.addService(username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 注册成功，跳转到登录页面
        response.sendRedirect("login.jsp");
    }
}