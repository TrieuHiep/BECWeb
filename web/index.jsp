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
    <title>Home</title>
    <link rel="stylesheet" href="css/style.css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
</head>
<body>
<div class="sidenav">
    <h5 style="margin-left: 18px;">SẢN PHẨM</h5>
    <a href="#">Sách</a> <a href="#s">Đồ điện tử</a> <a href="#">Quần áo</a>
</div>
<div class="main">
    <a href="#">Đăng nhập</a>
    <a href="#">Đăng ký</a>
    <a href="#">Đăng xuất</a>
    <a href="index.jsp">Trang chủ</a>
    <ul class="products">
        <li>
            <a class="link" href="productdetail.jsp">
                <img src="img/shirt.jpg" alt="ao phong black" width="200px" height="150px"/>
            </a>
            <img src="img/gift.png" style="width: 30px; height: 30px;"/><br>
            <a class="link" href="productdetail.jsp">Áo thun đen</a>
            <p>
                <strong>$50</strong>
            </p>
            <form>
                <input type="submit" value="Thêm vào giỏ hàng">
            </form>
        </li>
    </ul>
</body>
</html>
