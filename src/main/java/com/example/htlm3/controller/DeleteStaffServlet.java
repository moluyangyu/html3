package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.dao.staffDao;
import main.java.com.example.htlm3.entity.Staff;
import main.java.com.example.htlm3.service.serviceImpl.staffServiceImpl;
import main.java.com.example.htlm3.service.staffService;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteStaffServlet")
public class DeleteStaffServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取提交的表单数据
        int id = Integer.parseInt(request.getParameter("id"));

        // 调用staffDao进行删除操作
        //staffDao.deleteStaff(id);
        staffService staffService=new staffServiceImpl();
        try {
            staffService.deleteStaffById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 重定向到人员列表页面
        response.sendRedirect("people.jsp");
    }
}