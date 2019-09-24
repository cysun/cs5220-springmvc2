<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Product</title>
</head>
<body>
<table border="1">
  <tr><th>Id</th><td>${product.id}</td></tr>
  <tr><th>Name</th><td>${product.name}</td></tr>
  <tr><th>Quantity</th><td>${product.quantity}</td></tr>
  <tr><th>Price</th><td>${product.price}</td></tr>
</table>
</body>
</html>