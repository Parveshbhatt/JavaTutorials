<%@page import="com.Parvesh.dao.DB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update fever</title>
</head>
<body>

	<center>

	<%
		double fever = Double.parseDouble(request.getParameter("txtFever")) ;
		String feverId = request.getParameter("feverid");
	
	 	DB db = new DB();
		db.updateFever(fever, feverId);
	
	%>
	
	<h3>Fever Updated</h3><br>
	<h3><a href='viewfever.jsp'>View all FEVERS RECORDS</a></h3> 
	
	</center>


</body>
</html>