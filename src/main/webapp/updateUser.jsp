<%--
  Created by IntelliJ IDEA.
  User: owl
  Date: 4/11/19
  Time: 10:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Change user</title>
</head>
<body>
Change user data

<form action="/users/${param.id}" method="post">
    <input type="hidden" name="id" value="${param.id}">
    <input type="hidden" name="userName" value="${param.userName}">
    <input type="hidden" name="firstName" value="${param.FirstName}">
    <input type="hidden" name="lastName" value="${param.LastName}">
    <input type="hidden" name="phone" value="${param.Phone}">
    <input type="submit" value="UPDATE">


</form>
</body>
</html>
