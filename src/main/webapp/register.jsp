<%--
  Created by IntelliJ IDEA.
  User: LIU YI CHONG
  Date: 2023/7/21
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
    <link rel="stylesheet" href="css/login.css">
</head>
<body>
<form action="/register" class="login"method="post">
    <p>Register</p>
    <input type="text" placeholder="用户名"name="username">
    <input type="password" placeholder="密码"name="password">
    <input type="submit" class="btn" value="注册" >
</form>
</body>
</html>
