package in.vk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@GetMapping("/")
	public String openIndexpage() {
		return "index";
	}
	
	@GetMapping("/loginPage")
	public String openLoginPage() {
		return "Login";
	}
	
	@PostMapping("/LoginForm")
	public String Login(@RequestParam("username") String email, @RequestParam ("password")String password) {
		return "";
	}
}
