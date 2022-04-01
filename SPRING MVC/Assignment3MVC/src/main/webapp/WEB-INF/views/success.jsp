<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
 <h1 color="green">Welcome ${user.username}</h1>
    <hr>
    <h1 color="green">Email Id is: ${user.email}</h1>
    <hr>
    <h1 color="green">Password is: ${user.password}</h1>
</body>
</html>