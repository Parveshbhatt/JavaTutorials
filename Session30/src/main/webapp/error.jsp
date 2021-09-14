<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
</head>
<body>

	<center>
		<h3>OOPS! Something Went Wrong</h3>
		<h4>Message: <%= exception %></h4>
	</center>

</body>
</html>