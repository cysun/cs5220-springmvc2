<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring WebMVC</title>
</head>
<body>
<h2>Product</h2>
<form action="add.html" method="post">
<table border="1">
  <tr><th>Id</th><th>Name</th><th>Quantity</th><th>Price</th><th>Operations</th></tr>
  <c:forEach items="${products}" var="product">
    <tr>
      <td>${product.id}</td>
      <td>${product.name}</td>
      <td>${product.quantity}</td>
      <td>${product.price}</td>
      <td>
        <a href="view.html?id=${product.id}">View 1</a> |
        <a href="products/${product.id}.html">View 2</a>
      </td>
    </tr>
  </c:forEach>
  <tr>
    <td></td>
    <td><input type="text" name="name"></td>
    <td><input type="text" name="quantity"></td>
    <td><input type="text" name="price"></td>
    <td><button>Add</button></td>
  </tr>
</table>
</form>
</body>
</html>