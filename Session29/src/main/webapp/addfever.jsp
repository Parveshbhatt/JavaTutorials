<%@page import="com.Parvesh.dao.DB"%>
<%@page import="com.Parvesh.model.Fever"%>
<%@page import="com.Parvesh.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Fever</title>
</head>
<body>

	<%
	User user = (User) session.getAttribute("keyUser");
	%>

	<center>
		<h3>Welcome to Fever Management</h3>
		<b><%=user.name%></b>


		<%
		Fever fever = new Fever();
		fever.userId = user._id;
		fever.fever = Double.parseDouble(request.getParameter("txtFever"));

		DB db = new DB();
		db.logFever(fever);
		%>

		<p>
			Your Fever has been Recorded Successfully:
			<%=fever.fever%></p>


	</center>

</body>
</html>