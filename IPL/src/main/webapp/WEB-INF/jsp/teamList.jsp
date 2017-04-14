<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>team list</title>
</head>
<body bgcolor="wheat">



<c:forEach var="temp" items="${teams}">
	<a href="<c:url value='details?id=${temp.team_name}'/>"><img src="${temp.team_img_url}" alt="Image not found"></a>

</c:forEach>

</body>
</html>