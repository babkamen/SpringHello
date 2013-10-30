<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit note</title>
</head>
<body>
<form action="" method="post">
<input type="hidden"  name="id" value="${note.id}">
<input type="hidden" name="userId" value="${note.userId}">
<textarea rows="5" name="content" >${note.content}</textarea>
<input type="submit" value="Edit">
</form>
</body>
</html>