<%@page import="com.Parvesh.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome home</title>
</head>
<body>
 
 
	<% 
		User user = (User)session.getAttribute("keyUser");
	
	%>

		<center>
		
		
		<h2>Welcome Home, Dear <%= user.name %></h2>
		<h3><%= user.email %></h3>
		
		<h4>Log Your Fever Details Here: </h4>
		
		 <h3><a href='viewfever.jsp'>View all FEVERS RECORDS</a></h3> 
		
		
		<br>
		
		<form action="addfever.jsp" method="get" >
		<input type="text" name="txtFever" placeholder="eg. 98.4">
		<input type="submit" value="LOG FEVER"> 
		
		
		</form>
		
		</center>
 
</body>
</html>