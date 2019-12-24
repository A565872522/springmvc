<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/11/6
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <link rel="stylesheet" href="resource/css/my.css">
</head>

<script type="text/javascript">
    $(function() {
        // $.ajax({
            // url: "stu2",
            // type: "post",
            // success: function (data) {
            //     for (var i = 0; i < data.length; i++) {
            //         $("body").append("<h1>" + data[i].name + "," + data[i].age + "</h1>")
            //     }
            // }
        // })

        $("#btn").click(function () {
            $.ajax({
                "url":"stu3",
                "type":"post",
                "data":{
                    "name1":$("#name").val(),
                    "age1":$("#age").val()
                },
                "success":function (data) {
                    //console.log(data.result.name);
                    if(data==0){
                        alert("失败");
                    }else if(data==1){
                        alert("成功");
                    }else{
                        alert("操作有误");
                    }
                }
            })
        })
    })
</script>
<body>
    姓名：<input type="text" id="name"/><br>
    年龄：<input type="text" id="age"/><br>
    <input type="submit" id="btn"/>
</body>
</html>
