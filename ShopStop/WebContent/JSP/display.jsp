<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Page</title>
</head>
<body>
	<h2>Hello this is a display.jsp Page</h2>
	My name is: <%=request.getParameter("name") %><br>   
	Web site: <%=request.getParameter("company") %><br>
	Topic: <%=request.getParameter("technology") %><br>
	Forward Request came from the page: <%=request.getParameter("reqform") %>
</body>
</html>