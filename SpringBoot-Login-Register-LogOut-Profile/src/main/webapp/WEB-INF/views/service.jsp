<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Services - My Spring Boot App</title>
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
        max-width: 900px;
        margin: 0 auto;
        text-align: center;
    }
    main h1 {
        color: #333;
        margin-bottom: 1.5rem;
    }
    .services {
        display: grid;
        grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
        gap: 2rem;
        margin-top: 2rem;
    }
    .service-card {
        background-color: #f9f9f9;
        padding: 1.5rem;
        border-radius: 8px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        transition: transform 0.3s ease;
    }
    .service-card:hover {
        transform: translateY(-5px);
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
    }
    .service-card h3 {
        color: #4CAF50;
        margin: 0.5rem 0;
    }
    .service-card p {
        font-size: 1rem;
        color: #666;
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
        <h1>Our Services</h1>
        <div class="services">
            <div class="service-card">
                <h3>Web Development</h3>
                <p>Building responsive and scalable web applications using Spring Boot and React.</p>
            </div>
            <div class="service-card">
                <h3>Mobile Apps</h3>
                <p>Creating intuitive mobile applications for Android with modern frameworks.</p>
            </div>
            <div class="service-card">
                <h3>API Integration</h3>
                <p>Designing and implementing RESTful APIs for seamless data exchange.</p>
            </div>
        </div>
    </main>

    <footer>
        <p>© <%= new java.util.Date().getYear() + 1900 %> My Website. All rights reserved.</p>
    </footer>
</body>
</html>