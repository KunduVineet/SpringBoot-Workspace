<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About Us - My Spring Boot App</title>
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
        max-width: 800px;
        margin: 0 auto;
        text-align: center;
    }
    main h1 {
        color: #333;
        margin-bottom: 1.5rem;
    }
    main p {
        font-size: 1.1rem;
        color: #666;
        line-height: 1.6;
        margin-bottom: 1rem;
    }
    .team {
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        gap: 2rem;
        margin-top: 2rem;
    }
    .team-member {
        background-color: #f9f9f9;
        padding: 1rem;
        border-radius: 8px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        width: 200px;
    }
    .team-member h3 {
        color: #2196F3;
        margin: 0.5rem 0;
    }
    .team-member p {
        font-size: 0.9rem;
        color: #555;
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
        <h1>About Us</h1>
        <p>We are a passionate team of developers dedicated to building innovative web solutions using cutting-edge technologies like Spring Boot, React, and more.</p>
        <p>Our mission is to deliver user-friendly, scalable, and efficient applications that make a difference.</p>
        <div class="team">
            <div class="team-member">
                <h3>John Doe</h3>
                <p>Lead Developer</p>
            </div>
            <div class="team-member">
                <h3>Jane Smith</h3>
                <p>UI/UX Designer</p>
            </div>
            <div class="team-member">
                <h3>Alex Brown</h3>
                <p>Backend Engineer</p>
            </div>
        </div>
    </main>

    <footer>
        <p>© <%= new java.util.Date().getYear() + 1900 %> My Website. All rights reserved.</p>
    </footer>
</body>
</html>