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
import jakarta.servlet.http.HttpSession;

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
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/loginform")
	public String Login(@RequestParam("username") String email, @RequestParam ("password")String password, HttpSession session) {
		
		String page = "error";
		List<Student> students_list =  loginService.loginservice(email, password);
		
		if(students_list.size() != 0) {
			session.setAttribute("session_name",students_list.get(0).getName());
			session.setAttribute("session_email",students_list.get(0).getEmail());
			session.setAttribute("session_city",students_list.get(0).getCity());
			session.setAttribute("session_gender",students_list.get(0).getGender());

			page = "profile";
		}
		else {
			page = "error";
		}
		return page;
	}

	@GetMapping("/profile")
	public String openProfilePage() {
		return "profile";
	}
	
	@GetMapping("/logOut")
	public String logOut(HttpSession session) {
		session.invalidate();
		return "login";
	}

}
