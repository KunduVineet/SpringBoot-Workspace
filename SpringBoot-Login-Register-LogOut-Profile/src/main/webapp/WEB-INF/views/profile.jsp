<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <jsp:include page="header.jsp"/>

	<h2>Welcome : ${session_name}</h2>
	
	    <jsp:include page="footer.jsp"/>
</body>
</html>