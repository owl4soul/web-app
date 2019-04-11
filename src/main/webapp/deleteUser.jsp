<%--
  Created by IntelliJ IDEA.
  User: owl
  Date: 4/11/19
  Time: 9:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete user</title>
</head>

<body>
<form action="/users" method="post">
    <input required type="text" name = "userName" placeholder="USERNAME">
    <input required type="text" name = "firstName" placeholder="FIRSTNAME">
    <input required type="text" name="lastName" placeholder="LASTNAME">
    <input required type="text" name="phone" placeholder="PHONE">

    <input type="submit" value="SAVE">
</form>
</body>
</html>
