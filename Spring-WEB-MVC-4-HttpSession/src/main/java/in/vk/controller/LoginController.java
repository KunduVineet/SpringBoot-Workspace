package in.vk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String openLoginPage() {
        return "login";  // Returns login.jsp (or login.html depending on your view resolver)
    }

    @PostMapping("/loginform")
    public String loginForm(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {

        if(email.equals("kunduvineet6@gmail.com") && password.equals("vineet")) {
        	session.setAttribute("session_name", "Vineet Kundu");
        	session.setAttribute("session_gender", "Male");
            return "profile";  // Redirect to profile.jsp
        } else {
        	model.addAttribute("login_error","Email and password didn't matched");
            return "login";  // Stay on login.jsp
        }
    }
}
