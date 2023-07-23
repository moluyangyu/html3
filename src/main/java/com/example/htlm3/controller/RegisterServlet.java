package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.service.registerService;

import java.io.IOException;
import java.io.PrintWriter;
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
        String confirmPassword = request.getParameter("confirmPassword");

        // 检查密码是否一致
        if (!password.equals(confirmPassword)) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<p>密码不一致，请重新输入。</p >");
            out.println("返回注册");
            return;
        }

        // 保存用户信息到数据库或其他存储中
        registerService registerService = new registerServicelmpl() ;
        registerService.addService(String username,String password );
        // 注册成功，跳转到登录页面
        response.sendRedirect("login.html");
    }
}