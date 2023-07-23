package main.java.com.example.htlm3.controller;

import main.java.com.example.htlm3.service.poorService;
import main.java.com.example.htlm3.service.serviceImpl.poorServiceImpl;
import main.java.com.example.htlm3.service.staffService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/people")
public class StaffServlet extends HttpServlet {
    // 处理页面请求
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    /*    String action = request.getParameter("action");
        int id=0;
        if (action != null) {
            switch (action) {
                case "add":
                    staffService.Add(action,action,action);
                    break;
                case "edit":
                    staffService.ChangeLevel(action,id);
                    staffService.ChangeFamily(action,);
                    staffService.ChangeName(action,id);
                case "delete":
                    staffService.Delete(id);
                    break;
            }
        }

        List<Staff> staffList = getstaffList();
        request.setAttribute("staffList", staffList);
        request.getRequestDispatcher("people.jsp").forward(request, response);
        */

    }

    // 获取人员列表
    //staffService staff= new staffServiceImpl();
   // staff.getstaffList();
}

