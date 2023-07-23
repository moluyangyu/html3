package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.dao.poorDao;
import main.java.com.example.htlm3.dao.staffDao;
import main.java.com.example.htlm3.entity.Poor;
import main.java.com.example.htlm3.entity.Staff;
import main.java.com.example.htlm3.service.poorService;
import main.java.com.example.htlm3.service.serviceImpl.poorServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/addPoorServlet")
public class AddPoorServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取提交的表单数据
        String name = request.getParameter("name");

        String poorLevel=request.getParameter("poorlevel");
        String filingTime=request.getParameter("filingTime");
        String familySituation=request.getParameter("familySituation");



        // 创建新的staff对象
        Poor poor=new Poor();



        poor.setFilingTime(filingTime);
        poor.setPoorLevel(poorLevel);
        poor.setFamilySituation(familySituation);

        // 调用staffDao进行添加操作
        poorService poorserivce=new poorServiceImpl();
        try {
            poorserivce.Add( familySituation,name,poorLevel);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 重定向到人员列表页面
        response.sendRedirect("show.jsp");
    }
}