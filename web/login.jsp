<%--
  Created by IntelliJ IDEA.
  User: tatsuya
  Date: 27/09/2017
  Time: 23:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="bootstrap-3.03/css/bootstrap-theme.css">
    <link rel="stylesheet" type="text/css" href="bootstrap-3.03/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="bootstrap-3.03/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="bootstrap-3.03/css/bootstrap.min.css">
    <script src="jquery/jquery-3.2.1.min.js"></script>
    <script src="bootstrap-3.03/js/bootstrap.js" type="text/javascript"></script>
    <script src="bootstrap-3.03/js/bootstrap.min.js" type="text/javascript"></script>
    <%--<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css">--%>

    <%--<!-- Optional theme -->--%>
    <%--<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap-theme.min.css">--%>

    <%--<!-- Latest compiled and minified JavaScript -->--%>
    <%--<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>--%>
</head>
<body>

<form class="form-horizontal" role="form" action="login" method="post">

    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">Username</label>
                <input type="text" class="form-control" id="inputEmail3" placeholder="username" size="20" name="username">
            </div>
        </div>
    </div>


    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
                <input type="password" class="form-control" id="inputPassword3" placeholder="Password" size="35" name="password">
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <button type="submit" class="btn btn-primary">Sign in</button>
        </div>
    </div>


</form>

</body>
</html>

