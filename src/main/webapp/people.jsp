<%@ page import="main.java.com.example.htlm3.entity.Staff" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: LIU YI CHONG
  Date: 2023/7/22
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/show.css">
    <title>人员管理页面</title>

    <style>
        .btn2{
            width: 60px;
            height: 30px;
            color: white;
            background: #222;
            background: linear-gradient(45deg,red,orange,yellow,green,cyan,blue,purple,red);
            /*filter: blur(5px);*/
            background-size: 1000%;
            animation: amSize 40s linear infinite;
            position: relative;
            cursor: pointer;
            z-index: 1;
            border-radius: 10px;

        }

        @keyframes amSize {
            0%  {background-position: 0 0;}
            100%{background-position: 1000% 0;}
        }
        .btn2::before{
            opacity: 0;
        }
        .btn2:hover::before{opacity: 1;}
        .btn2:hover::after{opacity: 0;}

        .test{
            text-align: center;
        }
    </style>

</head>
<body>
<main class="table">
    <section class="header">
        <h1>人员信息展示</h1>
        <a href="test1.jsp" style="text-decoration: none">返回首页</a>
        <div class="input-group">
            <input type="search" placeholder="查找数据">
            <img src="images/8.jpg" alt="">
        </div>
    </section>
    <section class="shell">
        <table style="overflow: auto">
            <thread>
                <tr>
                    <th>ID</th>
                    <th>姓名</th>
                    <th>负责项目</th>
                    <th>年龄</th>
                    <th style="text-align: center">操作</th>
                </tr>
            </thread>
            <tbody>
            <%
                // 获取人员信息列表
                List<Staff> staffList = (List<Staff>) request.getAttribute("staffList");
                if (staffList != null) {
                    for (Staff staff : staffList) {
            %>
            <tr>
                <td><%=staff.getId()%></td>
                <td><%=staff.getName()%></td>
                <td><%=staff.getAge()%></td>
                <td>
                    <a href="editStaff.jsp?id=<%=staff.getId()%>">编辑</a>
                    <a href="deleteStaff.jsp?id=<%=staff.getId()%>">删除</a>
                </td>
            </tr>
            <%
                    }
                }
            %>
            </tbody>
        </table>

        <h2>添加人员信息</h2>
        <form action="/addStaffServlet" method="post">
            <input type="hidden" name="action" value="add">
            Id:<input type="number" name="ID" required><br>
            Name: <input type="text" name="姓名" required><br>
            Age: <input type="number" name="年龄" required><br>
            project<input type="text" name="负责项目" required>

            <input type="submit" value="Add">
        </form>
</body>
</html>
