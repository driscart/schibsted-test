<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>PAGE_3</title>
</head>
<body>
	<%@include file="accessControl.jsp" %>
	<%User user = (User)session.getAttribute("user");%>
	Hola <%= user.getUsername() %>
	<br>
	<a href="navigate.jsp">Go back</a>
	<%@include file="logout.jsp" %>
</body>
</html>