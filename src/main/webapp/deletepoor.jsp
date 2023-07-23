<%@ page import="main.java.com.example.htlm3.entity.Poor" %><%--
  Created by IntelliJ IDEA.
  User: syh-77
  Date: 2023/7/23
  Time: 22:31
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
  Poor poor= poorDao.getpoorById(id);
%>
<form method="post" action="/deletePoorServlet">
  <input type="hidden" name="id" value="<%=poor.getId()%>">
  <p>确认删除编号为 <%=poor.getId()%>，姓名为 <%=poor.getName()%> 的人员信息吗？</p>
  <input type="submit" value="确认删除">
</form>
</body>
</html>