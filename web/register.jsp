<%--
  Created by IntelliJ IDEA.
  User: tatsuya
  Date: 28/09/2017
  Time: 00:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <title>Tatsuya Book</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="bootstrap-3.03/css/bootstrap-theme.css">
    <link rel="stylesheet" type="text/css" href="bootstrap-3.03/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="bootstrap-3.03/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="bootstrap-3.03/css/bootstrap.min.css">
    <script src="jquery/jquery-3.2.1.min.js"></script>
    <script src="bootstrap-3.03/js/bootstrap.js" type="text/javascript"></script>
    <script src="bootstrap-3.03/js/bootstrap.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css">

    <!-- Optional theme -->
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap-theme.min.css">

    <!-- Latest compiled and minified JavaScript -->
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <form action="register" method="post">
                <br><b>Account Information</b><br>
                <div class="form-group">
                    Username<br>
                    <input class="form-group" type="text" name="username" value=""><br>
                    Password<br>
                    <input class="form-group" type="password" name="password" value=""><br>

                    <br><b>Address Information</b><br>
                    Road<br>
                    <input class="form-group" type="text" name="road" value=""><br>
                    District<br>
                    <input class="form-group" type="text" name="district" value=""><br>
                    City<br>
                    <input class="form-group" type="text" name="city" value=""><br>


                    <br><b>General Information</b><br>
                    Fullname<br> <input class="form-group" type="text" name="fullname" value=""><br>
                    Age<br>
                    <input class="form-group" type="text" name="age" value=""><br>
                    <br><b>Customer Information</b><br>
                    Email<br>
                    <input class="form-group" type="text" name="email" value=""><br>

                    <input class="btn-primary" type="submit" name="btnRegister" value="Register">
                </div>

            </form>
        </div>
    </div>
</div>
</body>
</html>
