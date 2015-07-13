<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>NAVIGATE</title>
</head>
<body>
	<%@include file="accessControl.jsp" %>
	<table>
		<% if (request.getAttribute("error") != null) { %>
			<tr><td colspan="2"><span class="error"><%= request.getAttribute("error") %></span></td></tr>
		<% } %>
		<tr><td><a href="navigate?idPage=1">Go to page 1</a></td></tr>
		<tr><td><a href="navigate?idPage=2">Go to page 2</a></td></tr>
		<tr><td><a href="navigate?idPage=3">Go to page 3</a></td></tr>
	</table>
	<%@include file="logout.jsp" %>
</body>
</html>