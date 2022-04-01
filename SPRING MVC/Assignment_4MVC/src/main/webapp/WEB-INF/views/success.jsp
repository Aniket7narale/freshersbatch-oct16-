<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<style>
    h1{
        color: darkgreen;
        align: center;
    }
</style>
<body>
<h1>Welcome ${user.username}</h1>
<hr>
<h1>Email Id is: ${user.email}</h1>
<hr>
<h1>Password is: ${user.password}</h1>

</body>
</html>
