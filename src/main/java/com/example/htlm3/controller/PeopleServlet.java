package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.entity.Poor;
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
@WebServlet("/show")
public class PeopleServlet extends HttpServlet {
    // 处理页面请求
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    /*    String action = request.getParameter("action");
        int id=0;
        if (action != null) {
            switch (action) {
                case "add":
                    poorService.Add(action,action,action);
                    break;
                case "edit":
                    poorService.ChangeLevel(action,id);
                    poorService.ChangeFamily(action,);
                    poorService.ChangeName(action,id);
                case "delete":
                    poorService.Delete(id);
                    break;
            }
        }

        List<Poor> poorList = getPoorList();
        request.setAttribute("personList", poorList);
        request.getRequestDispatcher("person.jsp").forward(request, response);
        */

    }

    // 获取人员列表
    poorService poorService = new poorServiceImpl();
   // poorService.getPoorLi st();
}

