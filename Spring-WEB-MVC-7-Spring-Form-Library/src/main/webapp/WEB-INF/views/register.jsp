<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
</head>
<body>
    <h2>Registration Form</h2>
    
    <form:form action="RegisterServlet" method="post" modelAttribute="modelStd">
        <label for="name">Name:</label>
        <form:input path="name" id="name" required="true" /><br><br>
        
        <label for="email">Email:</label>
        <form:input path="email" id="email" type="email" required="true" /><br><br>
        
        <label for="password">Password:</label>
        <form:password path="password" id="password" required="true" /><br><br>
        
        <label>Gender:</label>
        <form:radiobutton path="gender" value="Male" id="male" />
        <label for="male">Male</label>
        <form:radiobutton path="gender" value="Female" id="female" />
        <label for="female">Female</label>
        <form:radiobutton path="gender" value="Other" id="other" />
        <label for="other">Other</label><br><br>
        
        <label for="city">City:</label>
        <form:select path="city" id="city" required="true">
            <form:option value="">Select City</form:option>
            <form:option value="Gurgaon">Gurgaon</form:option>
            <form:option value="Noida">Noida</form:option>
            <form:option value="Pune">Pune</form:option>
            <form:option value="Bangalore">Bangalore</form:option>
            <form:option value="Hyderabad">Hyderabad</form:option>
        </form:select><br><br>
        
        <input type="submit" value="Register">
    </form:form>
</body>
</html>
