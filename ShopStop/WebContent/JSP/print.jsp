<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:useBean id="st" class="com.quinnox.basics.model.Employee"></jsp:useBean>
</head>
<body>
<jsp:setProperty property="*" name="st"/>
<h1>Employee details</h1>
employee id:<jsp:getProperty property="empno" name="st"/><br>
employee name:<jsp:getProperty property="empname" name="st"/><br>
employee designation:<jsp:getProperty property="desig" name="st"/><br>
</body>
</html>