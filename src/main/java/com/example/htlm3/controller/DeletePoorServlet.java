package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.dao.staffDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/deletePoorServlet")
public class DeletePoorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取提交的表单数据
        int id = Integer.parseInt(request.getParameter("id"));

        // 调用staffDao进行删除操作
        staffDao.deletePoor(id);

        // 重定向到人员列表页面
        response.sendRedirect("../webapp/show.jsp");
    }
}