<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<% 
	String name = (String)request.getAttribute("name");
	String city = (String)request.getAttribute("city");	
%>
	<h1>This is home page</h1>
	<h1>/home</h1>
	<h1>Hi <%= name %>, Welcome to <%= city %></h1>
	
</body>
</html>