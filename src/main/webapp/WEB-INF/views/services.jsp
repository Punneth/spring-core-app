<%@ page import="java.util.List" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Service Page</title>
</head>
<body>
	<h1>Inside Service Page</h1>
	<h1>Welcome to Service Page</h1>
	
	<%
		List<String> travels = (List<String>)request.getAttribute("service");
		String assist = (String)request.getAttribute("assist");
	%>
	
	<h2>Here we can provide you Below things,
	
	<ul> 
		<%
			for(String travel : travels){
		%>
				
				<li><%= travel %></li>
		<%		
			}
		%>
	</ul>
	
	</h2>
	
	<h1>
		<%= assist %> can assist you, Thank You
	</h1>
	
</body>
</html>