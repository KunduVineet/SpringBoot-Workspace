<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
    <h2>Login Form</h2>
   
    <form action="loginform" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <br><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br><br>
        
        <button type="submit">Login</button>
        
        <h2>Welcome ${model_name}</h2>
        
    </form>
</body>
</html>
