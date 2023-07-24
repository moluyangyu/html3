<%@ page import="com.example.htlm3.Comment" %>
<%@ page import="com.example.htlm3.controller.CommentServlet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>政绩评价</title>
    <link rel="stylesheet" href="css/style.css">
    <style>
        label{
            display: block;
            margin-bottom: 5px;
        }
        textarea{
            width: 50%;
            padding: 10px;
            border: 1px #ddd solid;
            height: 100px;
        }
        button{
            /*display: block;*/
            margin: 0 auto;
            width: 100px;
            height: 30px;
        }
    </style>
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
            <a href="picture.jsp" target="_blank">每日一图</a>
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
            <a href="comment.jsp">政绩评价</a>
        </li>
        <li>
            <a href="register.jsp">注册</a>
        </li>
        <li>
            <a href="login.jsp">登录</a>
        </li>
    </ul>
</div>
<h1>政绩评价</h1>

<div id="comments">
    <% for (Comment comment : CommentServlet.comments) { %>
    <div>
        <p><strong><%= comment.getName() %></strong></p>
        <p><%= comment.getMessage() %></p>
        <hr>
    </div>
    <% } %>
</div>

<h2>添加评论</h2>
<form action="comment" method="post">
    <label for="name">姓名：</label>
    <input type="text" id="name" name="name" required><br>
    <label for="message">评论内容：</label>
    <textarea id="message" name="message" required></textarea><br>
    <button type="submit">提交评论</button>
</form>
</body>
</html>