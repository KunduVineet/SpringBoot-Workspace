<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    /* Basic CSS for the footer */
    footer {
        background-color: #333;
        color: white;
        padding: 2rem 1rem;
        text-align: center;
        position: relative;
        bottom: 0;
        width: 100%;
    }
    footer .footer-content {
        display: flex;
        justify-content: space-around;
        flex-wrap: wrap;
        max-width: 1200px;
        margin: 0 auto;
    }
    footer .footer-section {
        margin: 1rem;
    }
    footer h3 {
        margin-bottom: 0.5rem;
    }
    footer ul {
        list-style: none;
        padding: 0;
    }
    footer ul li {
        margin: 0.5rem 0;
    }
    footer ul li a {
        color: #ddd;
        text-decoration: none;
    }
    footer ul li a:hover {
        color: #fff;
    }
    footer .footer-bottom {
        margin-top: 1rem;
        font-size: 0.9rem;
    }
</style>
</head>
<body>
    <footer>
        <div class="footer-content">
            <div class="footer-section">
                <h3>About Us</h3>
                <p>We are a team dedicated to building innovative web solutions.</p>
            </div>
            <div class="footer-section">
                <h3>Quick Links</h3>
                <ul>
                    <li><a href="home">Home</a></li>
                    <li><a href="about">About Us</a></li>
                    <li><a href="services">Services</a></li>
                    <li><a href="contact">Contact</a></li>
                </ul>
            </div>
            <div class="footer-section">
                <h3>Contact Info</h3>
                <p>Email: info@mywebsite.com</p>
                <p>Phone: +91 88829-24671</p>
                <p>Address: Gurgaon, Haryana</p>
            </div>
        </div>
        <div class="footer-bottom">
            <p>&copy; <%= new java.util.Date().getYear() + 1900 %> My Website. All rights reserved.</p>
        </div>
    </footer>
</body>
</html>