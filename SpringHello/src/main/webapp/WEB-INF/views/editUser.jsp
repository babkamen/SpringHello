<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit user</title>
</head>
<body>
<div class="register">
		<form action="" method="post">
			<div class="form-group">
				<label for="username">Usename</label> <input type="text"
					class="form-group" id="username" name="name"
					value="${user.name}"
					required
				>
			</div>
				<div class="form-group">
				<label for="email">Email</label> <input
					type="email" class=".form-group" id="email"  name="email"
					value="${user.email}"
					required
					>
			</div>
			<div class="form-group">
				<label >Password</label> <input
					type="text" class="form-group"  name="password"
					value="${user.password}"
					required
					>
			</div>
			<input type="submit" value="Submit">
			<button name="cancel">Cancel</button>
			
		</form>
	</div>
</body>
</html>