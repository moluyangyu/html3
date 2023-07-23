package main.java.com.example.htlm3.controller;

import com.google.gson.Gson;
import main.java.com.example.htlm3.service.chartService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ChartServlet", value = "/ChartServlet")
public class ChartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        chartService chartService = new chartServicelmpl();
        List<Integer> data=chartService.getdata();




        // 将数据以JSON格式返回给前端
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(new Gson().toJson(data));
    }
}