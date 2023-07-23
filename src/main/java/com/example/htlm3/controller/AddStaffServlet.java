package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.dao.staffDao;
import main.java.com.example.htlm3.entity.Staff;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addStaffServlet")
public class AddStaffServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取提交的表单数据
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        int id=Integer.parseInt(request.getParameter("id"));
        String project=request.getParameter("project");

        // 创建新的staff对象
       Staff staff = new Staff();
        staff.setName(name);
        staff.setAge(age);
        staff.setId(id);
        staff.setProject(project);

        // 调用staffDao进行添加操作
        staffDao.addStaff(staff);

        // 重定向到人员列表页面
        response.sendRedirect("../webapp/people.jsp");
    }
}
