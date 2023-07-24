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
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<canvas id="myChart"></canvas>
<script>
    // 使用Ajax从后端获取数据
    // 这里的URL是相对于JSP页面的路径，你需要根据具体情况修改
    var url = "ChartServlet";
    $.ajax({
        url: url,
        dataType: 'json',
        success: function(response) {
            // 获取从后端返回的数据
            var data = response.data;

            // 构造图表数据
            var labels = [];
            var values = [];
            for (var i = 0; i < data.length; i++) {
                labels.push(data[i].name);
                values.push(data[i].age);
            }

            // 创建图表
            var ctx = document.getElementById('myChart').getContext('2d');
            var myChart = new Chart(ctx, {
                type: 'bar',
                data: {
                    labels: labels,
                    datasets: [{
                        label: 'Age',
                        data: values,
                        backgroundColor: 'rgba(75, 192, 192, 0.2)',
                        borderColor: 'rgba(75, 192, 192, 1)',
                        borderWidth: 1
                    }]
                },
                options: {
                    responsive: true,
                    scales: {
                        y: {
                            beginAtZero: true
                        }
                    }
                }
            });
        }
    });
</script>
</body>
</html>
