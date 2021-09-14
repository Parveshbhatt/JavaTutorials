<%@page import="java.util.ArrayList"%>
<!--Directive in JSP i.e. page is Directive -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP DEMO</title>
</head>
<body>

	<h3>welcome to JSP</h3>
	
	
	<%-- Declarative Tag --%> 
	<%!
		int a=5;
	
		void hello(){
		System.out.println("Hello");
	}
		class User{
			
		}
		
		ArrayList<String> names = new ArrayList<String>();
		
	%>
	
	<%
		names.add("John");
		names.add("Kim");
		names.add("Sia");
		names.add("Mike");
	
	%>
	
	<%  
	  	for(String name: names){
	 %>		
	 
	<%--  <h4>Name: <%= name %></h4> --%>;
	<h4><% out.println(name); %></h4>
	  	
	 <% 
		}
	 %> 		
	   
	
	<%-- Scriplet --%>
	<%
		for(int i=0; i<=10; i++){
			/* System.out.println("i is: "+i); */
			out.println(i+"<br>");
		}
	%>
	
	
	
	<%-- Expression Tag : out.println, where out is referring to PrintWriter object of response --%>
	
	<h3>a is: <%= a %></h3>
	
	
	<%-- <h3>a again is: <% out.println(a); %></h3> --%>

</body>
</html>