<%--
  Created by IntelliJ IDEA.
  User: HIENNV
  Date: 04/03/2018
  Time: 8:17 CH
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Detail</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

</head>
<body>
<div class="sidenav2">
    <center>

        <img src="img/shirt.jpg" alt="no image" width="300px" height="300px">
        <p><span class="glyphicon glyphicon-zoom-in"></span> Rê chuột lên hình để phóng to</p>

    </center>
</div>

<div class="main2">
    <h2>Áo thun đen</h2>
    <div class="price">
        <img src="img/hotdeal.jpg" alt="no image" width="100px" height="50px">
        <span>Giá:</span> <span class="price">$50</span><span> Đã có VAT</span>
    </div>
    <br>
    <br>
    <ul>
        <li>Phù hợp cho cả nam và nữ</li>
    </ul>
    <div class="setting">
        <div class="popup" onclick="myFunction()">Xem nguồn gốc xuất xứ!
            <span class="popuptext" id="myPopup">Made in Germany!</span>
        </div>
    </div>
    <div>
        <form>
            <center><input class="buttonbuy" type="submit" name="submit" value="Thêm vào giỏ hàng"/></center>
        </form>
    </div>
</div>
<script src="js/script.js"></script>
</body>
</html>
