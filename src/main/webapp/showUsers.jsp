<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: owl
  Date: 4/11/19
  Time: 9:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show all users</title>
</head>

<body>
<table border="1">
<tr>
    <td>ID</td>
    <td>username</td>
    <td>first name</td>
    <td>last name</td>
    <td>phone</td>
    <td>Actions</td>
</tr>

<c:forEach items="${users}" var="user">
    <tr>
        <td>${user.getId()}</td>
        <td>${user.getUserName()}</td>
        <td>${user.getFirstName()}</td>
        <td>${user.getLastName()}</td>
        <td>${user.getPhone()}</td>
<td>
        <form action="updateUser.jsp" method="post">
        <input type="hidden" name="id" value="${user.getId()}">
        <input type="hidden" name="userName" value="${user.getUserName()}">
        <input type="hidden" name="firstName" value="${user.getFirstName()}">
        <input type="hidden" name="lastName" value="${user.getLastName()}">
        <input type="hidden" name="phone" value="${user.getPhone()}">
    </form>
</td>
    </tr>
</c:forEach>

</table>

<form action="addUser.jsp">
    <input type="submit" value="Add new user">
</form>
</body>
</html>
