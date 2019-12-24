<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/11/7
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>注册页面</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<script type="text/javascript">
    $(function () {
        $("#btn").click(function () {
            $.ajax({
                "url":"reg",
                "type":"post",
                "data":{
                    "name1":$("#name").val(),
                    "password1":$("#password").val(),
                },
                "success":function (data) {
                    alert(data.toString())
                }
            })
        })
    })
</script>
<body>
    <h1>请注册</h1>
    <hr>
    <form>
        请输入姓名：<input type="text" id="name"><br>
        请输入密码：<input type="password" id="password"><br>
        <input type="submit" id="btn">
    </form>
</body>
</html>
