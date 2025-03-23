<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Us - My Spring Boot App</title>
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
        max-width: 600px;
        margin: 0 auto;
        text-align: center;
    }
    main h1 {
        color: #333;
        margin-bottom: 1.5rem;
    }
    .contact-form {
        background-color: #f9f9f9;
        padding: 2rem;
        border-radius: 8px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }
    .form-group {
        margin-bottom: 1rem;
        text-align: left;
    }
    .form-group label {
        display: block;
        margin-bottom: 0.5rem;
        color: #555;
    }
    .form-group input, .form-group textarea {
        width: 100%;
        padding: 0.5rem;
        border: 1px solid #ccc;
        border-radius: 4px;
        font-size: 1rem;
    }
    .form-group input:focus, .form-group textarea:focus {
        border-color: #2196F3;
        outline: none;
    }
    .form-group textarea {
        height: 100px;
        resize: vertical;
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
        transition: background-color 0.3s ease;
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
    <jsp:include page="header.jsp"/>

    <main>
        <h1>Contact Us</h1>
        <div class="contact-form">
            <form action="/contact" method="post">
                <div class="form-group">
                    <label for="name">Name</label>
                    <input type="text" id="name" name="name" required>
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" id="email" name="email" required>
                </div>
                <div class="form-group">
                    <label for="message">Message</label>
                    <textarea id="message" name="message" required></textarea>
                </div>
                <button type="submit">Send Message</button>
            </form>
        </div>
    </main>

    <footer>
        <p>© <%= new java.util.Date().getYear() + 1900 %> My Website. All rights reserved.</p>
    </footer>
</body>
</html>