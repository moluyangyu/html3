package main.java.com.example.htlm3.controller;

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

@WebServlet("/updateStaffServlet")
public class UpdateStaffServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取提交的表单数据
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String project=request.getParameter("project");

        // 创建新的staff对象
        Staff staff = new Staff();
        staff.setId(id);
        staff.setName(name);
        staff.setAge(age);
        staff.setProject(project);

        // 调用staffDao进行更新操作
        staffService staffService=new staffServiceImpl();
        try {
            staffService.updateStaff(name,id,age,project);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 重定向到人员列表页面
        response.sendRedirect("../webapp/people.jsp");
    }
}