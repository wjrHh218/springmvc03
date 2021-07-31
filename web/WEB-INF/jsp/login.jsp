<%--
  Created by IntelliJ IDEA.
  User: teacher_c410
  Date: 2021/7/19
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录信息</title>
</head>
<link href="./css/login.css" type="text/css" rel="stylesheet"/>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    <input type="text" name="uname" class="textSize"/><br/>
    <input type="password" name="upass" class="textSize"/><br/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
