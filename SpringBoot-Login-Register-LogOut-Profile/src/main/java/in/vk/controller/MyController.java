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
import in.vk.service.RegisterServiceImpl;
import in.vk.service.RegisterServices;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {

    private final RegisterServiceImpl registerServiceImpl;

    MyController(RegisterServiceImpl registerServiceImpl) {
        this.registerServiceImpl = registerServiceImpl;
    }
	
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
	
	@Autowired
	RegisterServices registerServices;
	
	public String register(@RequestParam("name1") String name, @RequestParam("email1") String email, 
			@RequestParam("password1") String password, @RequestParam("gender1") String gender, @RequestParam("city1") String city) {
		
		Student std = new Student();
		std.setName(name);
		std.setEmail(email);
		std.setPassword(password);
		std.setCity(city);
		std.setGender(gender);
		
		boolean status = registerServices.registerService(std);
		String page = "error";
		
		if(status) {
			page = "Success";
		}	else {
			 page = "error";
		}
		return page;
	}

}
