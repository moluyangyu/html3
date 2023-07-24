<%@ page import="main.java.com.example.htlm3.entity.Staff" %>
<%@ page import="main.java.com.example.htlm3.dao.staffDao" %>
<%@ page import="main.java.com.example.htlm3.service.serviceImpl.staffServiceImpl" %>
<%@ page import="main.java.com.example.htlm3.service.staffService" %><%--
  Created by IntelliJ IDEA.
  User: syh-77
  Date: 2023/7/23
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>删除人员信息</title>
</head>
<body>
<h1>删除人员信息</h1>
<%-- 获取被删除人员的信息 --%>
<%
  int id = Integer.parseInt(request.getParameter("id"));
  staffService staffService=new staffServiceImpl();
  Staff staff = staffService.getstaffById(id);
%>
<form method="post" action="/deleteStaffServlet">
  <input type="hidden" name="id" value="<%=staff.getId()%>">
  <p>确认删除编号为 <%=staff.getId()%>，姓名为 <%=staff.getName()%> 的人员信息吗？</p>
  <input type="submit" value="确认删除">
</form>
</body>
</html>