<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<title>Hi ,admin</title>
</head>
<h2>Register</h2>
<body>
	<div class="register">
		<form action="add" method="post">
			<div class="form-group">
				<label for="name">Usename</label> <input type="text"
					class="form-group" id="name" name="name" value="${user.name}"
					required
				>
				<input type="hidden" name="id" value="${user.id}">
			</div>
				<div class="form-group">
				<label for="email">Email</label> <input
					type="email" class=".form-group" id="email"  name="email"
					required="required"
					value="${user.email}"
					>
			</div>
			<div class="form-group">
				<label >Password</label> <input
					type="text" class="form-group"  name="password"
					required="required"
					value="${user.password}"
					>
			</div>
			<button type="submit" class="btn btn-default">Add</button>
		</form>
	</div>
	<table class="table table-striped">
	<thead>
		<tr>
			<th>ID</th>
			<th>Username</th>
			<th>Email</th>
			<th>Password</th>
			<th></th>
			<th></th>
			
		</tr>
		</thead>
		<tbody>
		<tr>
			<c:forEach items="${userList}" var="user">
				<td><c:out value="${user.id}"></c:out></td>
				<td><c:out value="${user.name}"></c:out></td>
					<td><c:out value="${user.email}"></c:out></td>
				<td><c:out value="${user.password}"></c:out></td>
				<td><a href="edit/${user.id}">Edit</a></td>
				<td><a href="delete/${user.id}">Delete</a></td>
		</tr>
		</c:forEach>
</tbody>
	</table>

</body>
</html>
