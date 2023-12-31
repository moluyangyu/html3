<%--
  Created by IntelliJ IDEA.
  User: LIU YI CHONG
  Date: 2023/7/21
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>联系我们</title>
    <link rel="stylesheet" href="css/contact1.css">
</head>
<body>
<div class="logo">
    <img src="images/1.jpg" width="200" height="150">
    <h4>精准扶贫</h4>
    <p>传递爱心，情暖恩平</p>
</div>
<div class="nav">
    <ul>
        <li>
            <a href="test1.jsp">首页</a>
        </li>
        <li>
            <a href="chart.jsp">图表展示</a>
        </li>
        <li>
            <a href="picture.jsp" target="_blank">扶贫图片</a>
        </li>
        <li>
            <a href="show.jsp">扶贫数据展示</a>
        </li>
        <li>
            <a href="people.jsp">登录人员信息管理</a>
        </li>
        <li>
            <a href="contact.jsp">联系我们</a>
        </li>
        <li>
            <a href="register.jsp">注册</a>
        </li>
        <li>
            <a href="login.jsp">登录</a>
        </li>
    </ul>
</div>
<section id="contact-form" class="py">
    <div class="container">
        <h1><span class="test-primary">联系</span>我们</h1>
        <h4 style="text-align: center">如果有疑问请填写一下信息联系我们！</h4>
    </div>
    <form action="submit.jsp">
        <div class="form-group">
            <label for="name">姓名</label>
            <input type="text" name="name" id="name">
        </div>
        <div class="form-group">
            <label for="name">邮箱</label>
            <input type="text" name="email" id="email">
        </div>
        <div class="form-group">
            <label for="name">反馈内容</label>
            <textarea type="text" name="content" id="massage"></textarea>
        </div>
        <button type="submit" class="btn">提交</button>
    </form>
</section>

</body>
</html>
