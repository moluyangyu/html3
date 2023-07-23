<%@ page import="main.java.com.example.htlm3.entity.Poor" %>
<%@ page import="main.java.com.example.htlm3.service.poorService" %><%--
  Created by IntelliJ IDEA.
  User: syh-77
  Date: 2023/7/23
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
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
    Poor poor = poorService.getpoorById(id);
%>
<form method="post" action="/updatePoorServlet">
    <input type="hidden" name="id" value="<%=poor.getId()%>">
    姓名: <input type="text" name="name" value="<%=poor.getName()%>"><br>
    贫困等级: <input type="text" name="poorLevel" value="<%=poor.getPoorLevel()%>"><br>
    脱贫时间  <input type="date" name="filingTime" value="<%=poor.getFilingTime()%>"><br>
    家庭情况<input type="text" name="familySituation" value="<%=poor.getFamilySituation()%>"><br>
    <input type="submit" value="保存">
</form>
</body>
</html>