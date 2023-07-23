package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.dao.poorDao;
import main.java.com.example.htlm3.dao.staffDao;
import main.java.com.example.htlm3.entity.Poor;
import main.java.com.example.htlm3.entity.Staff;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/addPoorServlet")
public class AddPoorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取提交的表单数据
        String name = request.getParameter("name");
        int id = Integer.parseInt(request.getParameter("id"));
        String poorLevel=request.getParameter("poorlevel");
        String filingTime=request.getParameter("filingTime");
        String familySituation=request.getParameter("familySituation");



        // 创建新的staff对象
        Poor poor = new Poor();
       poor.setName(name);

        poor.setId(id);
        poor.setFilingTime(filingTime);
        poor.setPoorLevel(poorLevel);
        poor.setFamilySituation(familySituation);

        // 调用staffDao进行添加操作
        poorDao.addPoor(poor);

        // 重定向到人员列表页面
        response.sendRedirect("../webapp/show.jsp");
    }
}