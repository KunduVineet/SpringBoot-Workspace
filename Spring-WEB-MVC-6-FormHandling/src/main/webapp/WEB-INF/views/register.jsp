<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
</head>
<body>
    <h2>Registration Form</h2>
    <form action="RegisterServlet" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>
        
        <label>Gender:</label>
        <input type="radio" id="male" name="gender" value="Male" required>
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="Female">
        <label for="female">Female</label>
        <input type="radio" id="other" name="gender" value="Other">
        <label for="other">Other</label><br><br>
        
        <label for="city">City:</label>
        <select id="city" name="city" required>
            <option value="">Select City</option>
            <option value="New York">Gurgaon</option>
            <option value="Los Angeles">Noida</option>
            <option value="Chicago">Pune</option>
            <option value="Houston">Bangalore</option>
            <option value="Miami">Hyderabad</option>
        </select><br><br>
        
        <input type="submit" value="Register">
    </form>
</body>
</html>