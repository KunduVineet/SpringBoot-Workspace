<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register - My Spring Boot App</title>
<style>
    body {
        margin: 0;
        font-family: Arial, sans-serif;
        display: flex;
        flex-direction: column;
        min-height: 100vh;
    }
    main {
        flex: 1;
        padding: 2rem;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .register-container {
        background-color: #f9f9f9;
        padding: 2rem;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 100%;
        max-width: 400px;
    }
    .register-container h2 {
        text-align: center;
        margin-bottom: 1.5rem;
        color: #333;
    }
    .form-group {
        margin-bottom: 1rem;
    }
    .form-group label {
        display: block;
        margin-bottom: 0.5rem;
        color: #555;
    }
    .form-group input[type="text"],
    .form-group input[type="email"],
    .form-group input[type="password"] {
        width: 100%;
        padding: 0.5rem;
        border: 1px solid #ccc;
        border-radius: 4px;
        font-size: 1rem;
    }
    .form-group input:focus {
        border-color: #2196F3;
        outline: none;
    }
    .form-group .gender-options {
        display: flex;
        gap: 1rem;
    }
    button[type="submit"] {
        width: 100%;
        padding: 0.75rem;
        background-color: #2196F3;
        color: white;
        border: none;
        border-radius: 4px;
        font-size: 1rem;
        cursor: pointer;
    }
    button[type="submit"]:hover {
        background-color: #1e87db;
    }
    footer {
        background-color: #333;
        color: white;
        padding: 1rem;
        text-align: center;
        font-size: 0.9rem;
    }
</style>
</head>
<body>
    <!-- Include the header -->
    <jsp:include page="header.jsp"/>

    <!-- Registration form -->
    <main>
        <div class="register-container">
            <h2>Register</h2>
            <form action="/register" method="post">
                <div class="form-group">
                    <label for="name">Name</label>
                    <input type="text" id="name" name="name" required>
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" id="email" name="email" required>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" required>
                </div>
                <div class="form-group">
                    <label>Gender</label>
                    <div class="gender-options">
                        <label><input type="radio" name="gender" value="Male" required> Male</label>
                        <label><input type="radio" name="gender" value="Female"> Female</label>
                        <label><input type="radio" name="gender" value="Other"> Other</label>
                    </div>
                </div>
                <div class="form-group">
                    <label for="city">City</label>
                    <input type="text" id="city" name="city" required>
                </div>
                <button type="submit">Register</button>
            </form>
        </div>
    </main>

    <!-- Footer -->
    <footer>
        <p>© <%= new java.util.Date().getYear() + 1900 %> My Website. All rights reserved.</p>
    </footer>
</body>
</html>