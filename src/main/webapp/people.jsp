<%--
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
                    <th>具体情况</th>
                    <th>地点</th>
                    <th style="text-align: center">操作</th>
                </tr>
            </thread>
            <tbody>
            <tr>
                <td>001</td>
                <td>张三</td>
                <td>小康</td>
                <td>某某县城</td>
                <td>
                    <form action="" class="test">
                        <input type="submit" value="修改" class="btn2">
                        <input type="submit" value="删除" class="btn2">
                        <input type="submit" value="增加" class="btn2">
                    </form>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <form action="" class="test">
                        <input type="submit" value="修改" class="btn2">
                        <input type="submit" value="删除" class="btn2">
                        <input type="submit" value="增加" class="btn2">
                    </form>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <form action="" class="test">
                        <input type="submit" value="修改" class="btn2">
                        <input type="submit" value="删除" class="btn2">
                        <input type="submit" value="增加" class="btn2">
                    </form>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <form action="" class="test">
                        <input type="submit" value="修改" class="btn2">
                        <input type="submit" value="删除" class="btn2">
                        <input type="submit" value="增加" class="btn2">
                    </form>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <form action="" class="test">
                        <input type="submit" value="修改" class="btn2">
                        <input type="submit" value="删除" class="btn2">
                        <input type="submit" value="增加" class="btn2">
                    </form>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <form action="" class="test">
                        <input type="submit" value="修改" class="btn2">
                        <input type="submit" value="删除" class="btn2">
                        <input type="submit" value="增加" class="btn2">
                    </form>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <form action="" class="test">
                        <input type="submit" value="修改" class="btn2">
                        <input type="submit" value="删除" class="btn2">
                        <input type="submit" value="增加" class="btn2">
                    </form>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <form action="" class="test">
                        <input type="submit" value="修改" class="btn2">
                        <input type="submit" value="删除" class="btn2">
                        <input type="submit" value="增加" class="btn2">
                    </form>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <form action="" class="test">
                        <input type="submit" value="修改" class="btn2">
                        <input type="submit" value="删除" class="btn2">
                        <input type="submit" value="增加" class="btn2">
                    </form>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <form action="" class="test">
                        <input type="submit" value="修改" class="btn2">
                        <input type="submit" value="删除" class="btn2">
                        <input type="submit" value="增加" class="btn2">
                    </form>
                </td>
            </tr>
            </tbody>
        </table>
    </section>
</main>
</body>
</html>
