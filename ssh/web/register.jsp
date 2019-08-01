<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/1
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
</head>
<body>
    <form action="register.action" method="post">
        <label for="userName">用户名:</label><input id="userName" TYPE="text" name="userName">
        <label for="pass">密  码:</label><input id="pass" type="password" name="pass">
        <input type="submit" value="注册">
    </form>
</body>
</html>
