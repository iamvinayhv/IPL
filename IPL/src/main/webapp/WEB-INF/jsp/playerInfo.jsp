<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>player information</title>
</head>
<body background="images/trophy.jpg">
<style>
table, th, td {
    border: 1px solid gold;
    padding: 5px;
}
</style>

<div>
<img  src="${playerData.getPlayer_img_url()}">

<table align="right" style="color:aqua">
<tr><th colspan="2">Player Info.</th></tr>

<tr><td>Player ID</td><td>${playerData.getPlayer_id()}</td></tr>
<tr><td>Player Name</td><td>${playerData.getPlayer_name()}</td></tr>
<tr><td>Player Role</td><td>${playerData.getPlayer_role()}</td></tr>
<tr><td>Batting Style</td><td>${playerData.getPlayer_batting_style()}</td></tr>
<tr><td>Bowling Style</td><td>${playerData.getPlayer_bowling_style()}</td></tr>
<tr><td>Nationality</td><td>${playerData.getPlayer_nationality()}</td></tr>
<tr><td>D.O.B</td><td>${playerData.getPlayer_dob()}</td></tr>
<tr><td>Team ID</td><td>${playerData.getTeam_id()}</td></tr>


</table>

</div><br><br><br><br>

<center>
<form action="teamlist">
<input type="submit" value="Back to list of teams" style="color:blue;">
</form>

<br>



<br>

<a href="index.jsp"><input type="button" value="Home page" style="color:red;"></a>
</center>
</body>
</html>