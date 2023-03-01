<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>
<body>


	<div class="container mt-3">
		<h1 class="text-center">${Header}</h1>
		<p class="text-center">${Desc}</p>
		
		<form action="processform" method="post">
			<div class="form-group">
				<label for="userEmail" class="form-label">Email address</label> <input
					type="email" name="userEmail" class="form-control" id="userEmail"
					aria-describedby="emailHelp">
				<div id="emailHelp" class="form-text">We'll never share your
					email with anyone else.</div>
			</div>

			<div class="form-group">
				<label for="userName" class="form-label">User Name </label> 
			<input
				type="text" class="form-control" name="userName" id="userName"
				aria-describedby="emailHelp">
			</div>

			<div class="form-group">
				<label for="userPassword" class="form-label">User Password </label> 
				<input
					type="password" class="form-control" name="userPassword" id="userPassword"
					aria-describedby="emailHelp">
			</div>
			<div class="container text-center mt-3">
				<button type="submit" class="btn btn-success" >Sign Up</button>
			</div>
		</form>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
		crossorigin="anonymous"></script>
</body>
</html>
</html>