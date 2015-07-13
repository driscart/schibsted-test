<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Login</title>
</head>
<body>
	<form method="post" action="login">
		<table>
			<% if (request.getAttribute("error") != null) { %>
				<tr><td colspan="2"><span class="error"><%= request.getAttribute("error") %></span></td></tr>
			<% } %>
			<tr><td>User: </td><td><input type="text" name="username"/></td></tr>
			<tr><td>Password: </td><td><input type="password" name="password"/></td></tr>
			<tr><td colspan="2"><input type="submit" value="Login" /></td></tr>
		</table>
	</form>
</body>
</html>
