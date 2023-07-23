<%--
  Created by IntelliJ IDEA.
  User: LIU YI CHONG
  Date: 2023/7/23
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div id="chartContainer"></div>
<script>
    // 使用AJAX请求从后端获取数据
    $.ajax({
        url: 'ChartServlet', // 与后端获取数据的Servlet路径对应
        method: 'GET',
        success: function(data) {
            // 在成功回调函数中创建图表
            createChart(data);
        },
        error: function() {
            // 处理错误情况
        }
    });

    // 创建图表
    function createChart(data) {
        Highcharts.chart('chartContainer', {
            chart: {
                type: 'column'
            },
            title: {
                text: '数据图表'
            },
            xAxis: {
                categories: ['数据1', '数据2', '数据3'] // 根据实际情况设置横坐标标签
            },
            yAxis: {
                title: {
                    text: '值'
                }
            },
            series: [{
                name: '数据',
                data: data // 使用后端获取的数据
            }]
        });
    }
</script>
</body>
</html>
