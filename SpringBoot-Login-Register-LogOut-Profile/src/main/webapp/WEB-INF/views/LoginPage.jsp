<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            background-color: #f0f0f0;
        }
        .container {
            display: flex;
            flex: 1;
            justify-content: center;
            align-items: center;
            padding: 2rem;
            gap: 2rem;
        }
        .login-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 300px;
        }
        .login-container h2 {
            text-align: center;
            color: #333;
            margin-bottom: 1.5rem;
        }
        .form-group {
            margin-bottom: 1rem;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
            color: #333;
        }
        .form-group input[type="text"],
        .form-group input[type="password"] {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        .form-group input[type="text"]::placeholder,
        .form-group input[type="password"]::placeholder {
            color: #999;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-weight: bold;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        .sidebar {
            background-color: #333;
            color: white;
            padding: 2rem;
            border-radius: 5px;
            width: 100%;
            max-width: 300px;
            height: fit-content;
        }
        .sidebar h3 {
            margin-top: 0;
            margin-bottom: 1rem;
            color: #fff;
        }
        .sidebar p {
            margin: 0.5rem 0;
            color: #ddd;
            font-size: 0.95rem;
        }
        .sidebar ul {
            list-style: none;
            padding: 0;
            margin: 0;
        }
        .sidebar ul li {
            margin: 0.5rem 0;
        }
        .sidebar ul li a {
            color: #ddd;
            text-decoration: none;
        }
        .sidebar ul li a:hover {
            color: #fff;
        }
        footer {
            background-color: #333;
            color: white;
            padding: 1rem;
            text-align: center;
            font-size: 0.9rem;
        }
        @media (max-width: 768px) {
            .container {
                flex-direction: column;
                align-items: center;
            }
            .login-container, .sidebar {
                max-width: 100%;
            }
        }
    </style>
</head>
<body>
    <jsp:include page="header.jsp"/>

    <div class="container">
        <div class="login-container">
            <h2>Login Form</h2>
            <form action="loginform" method="post">
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username" placeholder="your-gmail-address@gmail.com" required>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" placeholder="password" required>
                </div>
                <input type="submit" value="Login">
            </form>
        </div>

    </div>

    <jsp:include page="footer.jsp"/>
</body>
</html>