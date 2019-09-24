<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring WebMVC</title>
</head>
<body>
<h2>Product</h2>
<table border="1">
  <tr><th>Id</th><th>Name</th><th>Quantity</th><th>Price</th></tr>
  <c:forEach items="${products}" var="product">
    <tr>
      <td>${product.id}</td>
      <td>${product.name}</td>
      <td>${product.quantity}</td>
      <td>${product.price}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>