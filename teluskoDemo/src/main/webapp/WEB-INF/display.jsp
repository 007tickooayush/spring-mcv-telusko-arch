<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DISPLAY PAGE</title>
</head>
<body>
	<%-- RESULT IS: <%= request.getAttribute("result") %> --%>
	<%-- show result using  EL EXPRESSION LANGUAGE: ${ } --%>
	RESULT IS: ${result}
	
</body>
</html>