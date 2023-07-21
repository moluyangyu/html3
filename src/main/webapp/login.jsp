<%--
  Created by IntelliJ IDEA.
  User: LIU YI CHONG
  Date: 2023/7/21
  Time: 15:27
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
<form action="/login" method="post" class="login">
    <p>Login</p>
    <input type="text" placeholder="用户名"NAME="username">
    <input type="password" placeholder="密码"NAME="password">
    <input type="submit" class="btn" value="登录">
    <input type="submit" class="btn" value="点击注册" onclick="window.open('register.jsp')">
</form>
</body>
</html>
