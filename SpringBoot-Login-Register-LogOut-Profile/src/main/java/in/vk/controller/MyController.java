package in.vk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String openHomepage() {
		return "HomePage";
	}
	
	@GetMapping("/home")
	public String openHomepagee() {
		return "HomePage";
	}
	
	@GetMapping("/about")
	public String openaboutpagee() {
		return "about";
	}
	
	@GetMapping("/services")
	public String openservice() {
		return "service";
	}
	
	@GetMapping("/contact")
	public String openContactpagee() {
		return "contact";
	}
	
	@GetMapping("/register")
	public String openRegPage() {
		return "RegisterPage";
	}
	
	@GetMapping("/login")
	public String openLoginPage() {
		return "LoginPage";
	}

}
