<%@ page import="main.java.com.example.htlm3.entity.Poor" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: LIU YI CHONG
  Date: 2023/7/21
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>扶贫数据展示</title>
    <link rel="stylesheet" href="css/show.css">
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
                    <th>贫困等级</th>
                    <th>家庭情况</th>
                    <th style="text-align: center">操作</th>
                </tr>
            </thread>
            <tbody>
            <%
                // 获取人员信息列表
                List<Poor> poorList = (List<Poor>) request.getAttribute("poorList");
                if (poorList != null) {
                    for (Poor poor : poorList) {
            %>
            <tr>

                <td><%=poor.getName()%></td>
                <td><%=poor.getPoorLevel()%></td>

                <td><%=poor.getFamilySituation()%></td>
                <td>
                    <a href="editPoor.jsp?id=<%=poor.getId()%>">编辑</a>
                    <a href="deletePoor.jsp?id=<%=poor.getId()%>">删除</a>
                </td>
            </tr>
            <%
                    }
                }
            %>
            </tbody>
        </table>

        <h2>添加人员信息</h2>
        <form action="/addPoorServlet" method="post">
            <input type="hidden" name="action" value="add">
            Name: <input type="text" name="姓名" required><br>
            PoorLevel: <input type="text" name="贫困情况" required><br>

            FamilySituation<input type="text" name="家庭情况" required>

            <input type="submit" value="Add">
        </form>
    </section>
</main>
</body>
</html>
