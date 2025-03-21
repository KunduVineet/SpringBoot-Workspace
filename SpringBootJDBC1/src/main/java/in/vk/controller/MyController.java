package in.vk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.vk.beans.Student;
import in.vk.service.LoginService;

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
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/LoginForm")
	public String Login(@RequestParam("username") String email, @RequestParam ("password")String password, Model model) {
		
		String page = "error";
		List<Student> students_list =  loginService.loginservice(email, password);
		
		if(students_list.size() != 0) {
			model.addAttribute("model_student",students_list.get(0));
			page = "profile";
		}
		else {
			page = "error";
		}
		return page;
	}
}
