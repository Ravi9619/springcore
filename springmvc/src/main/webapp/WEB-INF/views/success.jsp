<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 style="color: green;">${msg }</h2>
	<h3>${Header }</h3>
	<h3>${Desc }</h3>
	<hr>
	<h2>Hello ${user.userName }</h2>
	<h2>Your email is ${user.userEmail }</h2>
	<h2>Password ${user.userPassword }</h2>
</body>
</html>