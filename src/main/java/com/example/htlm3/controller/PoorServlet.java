package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.entity.Poor;
import main.java.com.example.htlm3.entity.Staff;
import main.java.com.example.htlm3.service.poorService;
import main.java.com.example.htlm3.service.serviceImpl.poorServiceImpl;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/PoorServlet")
public class PoorServlet extends HttpServlet {
    // 处理页面请求
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Poor> poorList = getpoorList();
        request.setAttribute("poorList", poorList);
        request.getRequestDispatcher("../webapp/show.jsp").forward(request, response);


    }
}
