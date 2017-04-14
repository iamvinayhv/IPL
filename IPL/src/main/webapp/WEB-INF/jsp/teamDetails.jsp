<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>team details</title>
</head>
<body background="images/details.jpg">

<style>
table, th, td {
    border: 1px solid aqua;
    padding: 5px;
}
</style>
<center>
<table style="color:gold;">
	<tr><th colspan="2">Team Details</th></tr>
	<tr><td>Team ID</td><td>${teamDetails.getTeam_id()}</td></tr>
	<tr><td>Team Name</td><td>${teamDetails.getTeam_name()}</td></tr>
	<tr><td>Team Coach</td><td>${teamDetails.getTeam_coach()}</td></tr>
	<tr><td>Team Captain</td><td>${teamDetails.getTeam_captain()}</td></tr>
	<tr><td>Team Home Venue</td><td>${teamDetails.getTeam_home_venue()}</td></tr>
	<tr><td>Team Owner</td><td>${teamDetails.getTeam_owener()}</td></tr>
	
</table>
<br><br>
<b>
<a href="<c:url value='listOfPlayers?id=${teamDetails.getTeam_id()}'></c:url>">players in team</a>
</b>
</center>
</body>
</html>