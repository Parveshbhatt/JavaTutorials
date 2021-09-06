<%@page import="com.Parvesh.dao.DB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
	<%
	
		DB db = new DB();	
	
		String action = request.getParameter("action");
		String feverId = request.getParameter("feverid");
		String fever = request.getParameter("fever");
		
		if(action.equals("delete")){
			// delete the fever record
			db.deleteFever(feverId);
	%>		
	
		<h3>Fever Record Deleted</h3>
	<%
		}else{		
	%>	
	
		<h3>UPDATE FEVER</h3>
	
		<form action="update.jsp" method = "get">
			<input type='text' name='txtFever' value='<%=fever%>'>
			<input type='hidden' name='feverid' value='<%=feverId%>'>
			<input type='submit' value='UPDATE FEVER'>
		
		</form>	  
	
	<% 	
	 // update the fever record
		}
	
	%>
</center>
</body>
</html>