package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.entity.user;
import main.java.com.example.htlm3.service.serviceImpl.userServiceImpl;
import main.java.com.example.htlm3.service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("contact.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        userService userService=new userServiceImpl();
        user user= null;
        try {
            user = userService.login(username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (user==null){
            req.getRequestDispatcher("login.jsp").forward(req,resp);
            resp.getWriter().println("登录失败，用户名或密码错误");
        }else {
            resp.sendRedirect("contact.jsp");
        }
    }
}
