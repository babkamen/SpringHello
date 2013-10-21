<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<h1>Register</h1>
<form action="add" method="GET">
<input type="text" name="name">
<input type="text" name="password">
<input type="submit" value="Submit">
<form>
<c:forEach items="${userList}" var="user" }>
<c:out value="${user}.id}"></c:out>
<c:out value="${user}.name}"></c:out>
<c:out value="${user}.pass}"></c:out>
</c:forEach>


</body>
</html>
