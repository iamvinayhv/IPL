<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list of players</title>
</head>
<body  background="images/players.jpg">

<style>
table, th, td {
    border: 1px solid green;
    padding: 5px;
}
</style>
<center>
<table style="color:red">
	<tr><td><b>Players Name</b></td></tr>
	
<c:forEach var="temp" items="${players}">

	<tr><td><a href="<c:url value='playerInfo?id=${temp}'/>">${temp}</a></td></tr>

</c:forEach>

</table>
</center>
</body>
</html>