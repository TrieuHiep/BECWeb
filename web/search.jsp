<%@ page import="model.itemspkg.Product" %><%--
  Created by IntelliJ IDEA.
  User: tatsuya
  Date: 26/02/2018
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/search" method="post">

    <select name="productType" onclick="true">
        <option value="1">Book</option>
        <option value="2">Electronics</option>
        <option value="3">Clothes</option>
    </select>

    <select name="electronicType">
        <option value="television">Television</option>
        <option value="ref">Refrigerator</option>
        <option value="laptop">Laptop</option>
    </select>
    <input type="submit" value="Search">
</form>

<%
    Product[] products = (Product[]) session.getAttribute("searchProductResult");
    if (products != null) {
        for (Product product : products) {
%>
<%--in danh sach san phan--%>
<b><%=product.getName()%></b>

<br>
<%
        }
    }
%>
</body>
</html>
