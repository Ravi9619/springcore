<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
		
		<h1>This is help page</h1>
		<%-- <% 
			String name = (String)request.getAttribute("name");
			Integer rollnumber =(Integer)request.getAttribute("rollnumber");
		%>
		<h2>Hello name is <%= name %></h2> --%>
		
		<h2>Hello name is ${name }</h2>
		
</body>
</html>