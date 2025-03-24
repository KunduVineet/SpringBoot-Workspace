<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    /* Basic CSS for the header */
    body {
        margin: 0px;
        padding: 0px;
    }
    header {
        background-color: #333;
        padding: 1rem;
        color: white;
        display: flex;
        justify-content: space-between;
        align-items: center;
    }
    header h1 {
        margin: 0;
        font-size: 1.5rem;
    }
    nav ul {
        list-style: none;
        margin: 0;
        padding: 0;
        display: flex;
    }
    nav ul li {
        margin-left: 2rem;
    }
    nav ul li a {
        color: white;
        text-decoration: none;
        font-weight: bold;
    }
    nav ul li a:hover {
        color: #ddd;
    }
    .auth-buttons {
        display: flex;
        gap: 1.2rem; /* Slightly increased gap for better spacing */
    }
    .auth-buttons a {
        padding: 0.6rem 1.2rem; /* Slightly larger padding for better click area */
        font-size: 1rem;
        font-weight: 600; /* Slightly lighter than bold for a modern feel */
        color: white;
        text-decoration: none;
        border-radius: 6px; /* Slightly more rounded corners */
        display: inline-block; /* Ensures proper button-like behavior */
        transition: all 0.3s ease; /* Smooth transition for all changes */
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2); /* Subtle shadow for depth */
    }
    .auth-buttons .login-btn {
        background: linear-gradient(135deg, #4CAF50, #388E3C); /* Gradient for login */
    }
    .auth-buttons .login-btn:hover {
        background: linear-gradient(135deg, #45a049, #357a38); /* Darker gradient on hover */
        transform: translateY(-2px); /* Slight lift effect */
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3); /* Enhanced shadow on hover */
    }
    .auth-buttons .register-btn {
        background: linear-gradient(135deg, #2196F3, #1976D2); /* Gradient for register */
    }
    .auth-buttons .register-btn:hover {
        background: linear-gradient(135deg, #1e87db, #1565c0); /* Darker gradient on hover */
        transform: translateY(-2px); /* Slight lift effect */
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3); /* Enhanced shadow on hover */
    }
    /* Responsive adjustments */
    @media (max-width: 600px) {
        .auth-buttons {
            gap: 0.8rem;
        }
        .auth-buttons a {
            padding: 0.5rem 1rem;
            font-size: 0.9rem;
        }
    }
</style>
</head>
<body>
<%
	String name = (String) session.getAttribute("session_name");
	if(name != null){
		%>
		 <header>
        <h1>My Website</h1>
        <nav>
            <ul>
                <li><a href="home">Home</a></li>
                <li><a href="about">About</a></li>
                <li><a href="services">Services</a></li>
                <li><a href="contact">Contact</a></li>
            </ul>
        </nav>
         <div class="auth-buttons">
            <a href="profile" class="login-btn"><%= name %></a>
            <a href="logOut" class="register-btn">LogOut</a>
        </div>
       
    </header>
		<%
	
}	 else{
	%>
	 <header>
        <h1>My Website</h1>
        <nav>
            <ul>
                <li><a href="home">Home</a></li>
                <li><a href="about">About</a></li>
                <li><a href="services">Services</a></li>
                <li><a href="contact">Contact</a></li>
            </ul>
        </nav>
        <div class="auth-buttons">
            <a href="login" class="login-btn">Login</a>
            <a href="register" class="register-btn">Register</a>
        </div>
    </header>
    <% 
}
%>
   
</body>
</html>