<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Upload File</h2>

<form action="uploadFileForm" method="post" enctype="multipart/form-data">
	<input type="file" name="myfile"/>
	<input type="submit" value="upload">
</form>

</body>
</html>