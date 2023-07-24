package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.entity.Integer;
import main.java.com.example.htlm3.service.chartService;
import main.java.com.example.htlm3.service.serviceImpl.chartServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Integer> dataList = new ArrayList<>();
        chartService chartService=new chartServiceImpl();
        try {
            dataList=chartService.getdata();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        // 构造JSON格式的数据
        String jsonData = "{\"data\": " + dataList + "}";

        // 设置响应内容的类型为JSON
        response.setContentType("application/json");

        // 将JSON数据写入响应
        PrintWriter out = response.getWriter();
        out.print(jsonData);
        out.flush();
    }

}