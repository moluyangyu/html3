package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.dao.staffDao;
import main.java.com.example.htlm3.service.serviceImpl.staffServiceImpl;
import main.java.com.example.htlm3.service.staffService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/deletePoorServlet")
public class DeletePoorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取提交的表单数据
        int id = Integer.parseInt(request.getParameter("id"));

        // 调用staffDao进行删除操作
        staffService staffservice=new staffServiceImpl();
        try {
            staffservice.deleteStaffById(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 重定向到人员列表页面
        response.sendRedirect("show.jsp");
    }
}