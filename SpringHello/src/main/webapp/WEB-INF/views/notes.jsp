<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet" type="text/css" href="../../css/bootstrap.css">
 <script src="http://code.jquery.com/jquery.js"></script>
    <script src="../../js/bootstrap.min.js"></script>
<title>Hi ,admin</title>
</head>
<h2>Notes</h2>
<body>
	<table class="table table-striped">
		<tr>
			<c:forEach items="${noteList}" var="note">
				<td><c:out value="${note.content}"></c:out></td>
				<td><a href="edit/${note.id}">Edit</a></td>
				<td><a href="delete/${note.id}">Delete</a></td>
		</tr>
		</c:forEach>

	</table>
 	<h2>Add note</h2>
	<form action="add" method="post">

		<p>
			<textarea name="content" rows="5">${note.content}</textarea>
		</p>

		<input type="submit" value="Add">

	</form>

</body>
</html>
