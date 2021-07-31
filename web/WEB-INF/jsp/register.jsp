<%--
  Created by IntelliJ IDEA.
  User: teacher_c410
  Date: 2021/7/19
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/register" method="post" name="users">
    <input class="textSize" type="text" name="uname" value="${uname}"><br/>
    <input class="textSize" type="password" maxlength="20" name="upass"><br/>
    <input class="textSize" type="password" maxlength="20" name="reupass"><br/>
    <input type="submit" value="提交注册"/>
</form>
</body>
</html>
