<%@ page import="main.java.com.example.htlm3.entity.Staff" %>
<%@ page import="main.java.com.example.htlm3.dao.staffDao" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>编辑人员信息</title>
</head>
<body>
<h1>编辑人员信息</h1>
<%-- 获取被编辑人员的信息 --%>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    Staff staff = staffDao.getstaffById(id);
%>
<form method="post" action="/updateStaffServlet">
    <input type="hidden" name="id" value="<%=staff.getId()%>">
    姓名: <input type="text" name="name" value="<%=staff.getName()%>"><br>
    年龄: <input type="text" name="age" value="<%=staff.getAge()%>"><br>
    <input type="submit" value="保存">
</form>
</body>
</html>