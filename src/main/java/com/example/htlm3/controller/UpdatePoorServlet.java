package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.entity.Poor;
import main.java.com.example.htlm3.entity.Staff;
import main.java.com.example.htlm3.service.poorService;
import main.java.com.example.htlm3.service.serviceImpl.poorServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

@WebServlet("/updatePoorServlet")
public class UpdatePoorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取提交的表单数据
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String poorlevel=request.getParameter("poorlevel");
        String filingTime=request.getParameter("filingTime");
        String familySituation=request.getParameter("familySituation");

        // 创建新的staff对象
        Poor poor = new Poor();
        poor.setId(id);
        poor.setName(name);
        poor.setPoorLevel(poorlevel);

        poor.setFamilySituation(familySituation);

        // 调用staffDao进行更新操作
        poorService poorservice=new poorServiceImpl();
        try {
            poorservice.ChangeFamily(familySituation,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            poorservice.ChangeLevel(poorlevel,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            poorservice.ChangeName(name,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // 重定向到人员列表页面
        response.sendRedirect("../webapp/show.jsp");
    }
}