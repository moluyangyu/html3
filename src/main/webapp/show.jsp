<%--
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
    <style>
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body{
            min-height: 100vh;
            background: url("images/8.jpg");
            background-size: 100% 100%;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        main.table{
            width: 82vw;
            height: 90vh;
            background-color: #fff5;
            box-shadow: 0 8px 16px #005;
            border-radius: 16px;
            overflow: auto;
        }

        .header{
            width: 100%;
            height: 10%;
            background-color: #fff4;
            padding: 0 50px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .header .input-group{
            width: 35%;
            height: 50%;
            background-color: #fff5;
            padding: 0 20px;
            border-radius: 10px;
            display: flex;
            justify-content: center;
            align-items: center;
            transition: .2s;
        }

        .header .input-group:hover{
            width: 45%;
            background-color: #fff8;
            box-shadow: 0 5px 40px #0002;
        }

        .header .input-group img{
            width: 20px;
            height: 20px;
        }

        .header .input-group input{
            width: 100%;
            background-color: transparent;
            border: none;
            outline: none;
        }

        table{
            width: 100%;
            overflow: auto;
        }

        .shell{
            width: 95%;
            max-height: calc(90%- 25px);
            background-color: #fffb;
            margin: 8px auto;
            border-radius: 10px;
            overflow: auto;
        }

        .shell::-webkit-scrollbar{
            width: 10px;
            height: 10px;
        }

        table,
        th,
        td{
            border-collapse: collapse;
            padding: 20px;
            text-align: left;
        }

        thread th{
            position: sticky;
            top: 0;
            left: 0;
            background-color: #d5d1defe;
            cursor: pointer;
        }

        .button{
            padding: 5px 0;
            border-radius: 40px;
            text-align: center;
        }
    </style>
</head>
<body>
<main class="table">
    <section class="header">
        <h1>数据信息展示</h1>
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
                    <th>操作</th>
                </tr>
            </thread>
            <tbody>
            <tr>
                <td>001</td>
                <td>张三</td>
                <td>小康</td>
                <td>某某县城</td>
                <td>
                    <p class="button">删除</p>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <p class="button">删除</p>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <p class="button">删除</p>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <p class="button">删除</p>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <p class="button">删除</p>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <p class="button">删除</p>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <p class="button">删除</p>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <p class="button">删除</p>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <p class="button">删除</p>
                </td>
            </tr>
            <tr>
                <td>002</td>
                <td>李四</td>
                <td>小康</td>
                <td>某某市区</td>
                <td>
                    <p class="button">删除</p>
                </td>
            </tr>
            </tbody>
        </table>
    </section>
</main>
</body>
</html>
