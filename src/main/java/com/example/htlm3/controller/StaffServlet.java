package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.entity.Staff;
import main.java.com.example.htlm3.service.poorService;
import main.java.com.example.htlm3.service.serviceImpl.poorServiceImpl;
import main.java.com.example.htlm3.service.serviceImpl.staffServiceImpl;
import main.java.com.example.htlm3.service.staffService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/StaffServlet")
public class StaffServlet extends HttpServlet {
    // 处理页面请求
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Staff> staffList = new ArrayList<>();
        staffService staffservice=new staffServiceImpl();
        try {
            staffList=staffservice.getstaffList();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("staffList", staffList);
        request.getRequestDispatcher("people.jsp").forward(request, response);


    }
}
