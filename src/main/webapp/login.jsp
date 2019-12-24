<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/11/7
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>登录页面</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<script type="text/javascript">
    $(function () {
        $("#btn1").click(function () {
            $.ajax({
                "url":"login",
                "type":"post",
                "data":{
                    "name2":$("#name").val(),
                    "password2":$("#password").val()
                },
                "success":function (data) {
                    alert(data.toString())
                }
            })
        })
    })
</script>
<body>
    <h1>请登录</h1>
    <hr>
    <form action="">
        姓名：<input type="text" id="name"><br>
        密码：<input type="password" id="password"><br>
        <input type="submit" id="btn1">
    </form>
</body>
</html>
