package in.vk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("model_name")
public class LoginController {

    @GetMapping("/login")
    public String openLoginPage(Model model) {
    	
    	String name = "VK";
    	
    	model.addAttribute("model_name",name);
        return "login";  // Returns login.jsp (or login.html depending on your view resolver)
    }
    
    @PostMapping("/loginform")
    public String openLogin() {
        return "profile";  // Returns login.jsp (or login.html depending on your view resolver)
    }

    
}
