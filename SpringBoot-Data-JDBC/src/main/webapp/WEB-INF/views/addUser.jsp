<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Information Form</title>
<style>
    .form-container {
        max-width: 400px;
        margin: 50px auto;
        padding: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }
    .form-group {
        margin-bottom: 15px;
    }
    label {
        display: block;
        margin-bottom: 5px;
    }
    input[type="text"], 
    input[type="email"],
    select {
        width: 100%;
        padding: 8px;
        margin-bottom: 10px;
    }
    input[type="radio"] {
        margin-right: 5px;
    }
    input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        padding: 10px 15px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
</style>
</head>
<body>
    <div class="form-container">
        <h2>User Information</h2>
        <form action="process.jsp" method="post">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required>
            </div>
            
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            
            <div class="form-group">
                <label>Gender:</label>
                <input type="radio" id="male" name="gender" value="male" required>
                <label for="male" style="display: inline;">Male</label>
                <input type="radio" id="female" name="gender" value="female">
                <label for="female" style="display: inline;">Female</label>
                <input type="radio" id="other" name="gender" value="other">
                <label for="other" style="display: inline;">Other</label>
            </div>
            
            <div class="form-group">
                <label for="city">City:</label>
                <select id="city" name="city" required>
                    <option value="">Select a city</option>
                    <option value="newyork">New York</option>
                    <option value="london">London</option>
                    <option value="tokyo">Tokyo</option>
                    <option value="paris">Paris</option>
                    <option value="sydney">Sydney</option>
                </select>
            </div>
            
            <input type="submit" value="Add User">
        </form>
    </div>
</body>
</html>