<%--
  Created by IntelliJ IDEA.
  User: HIENNV
  Date: 04/03/2018
  Time: 12:19 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <form action="LoginServlet" method="post">
        User Name: <input type="text" name="username" value=""/><br>
        Password : <input type="password" name="password" value=""><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>
