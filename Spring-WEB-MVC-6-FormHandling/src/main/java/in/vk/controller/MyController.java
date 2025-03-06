package in.vk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.vk.beans.Student;
import jakarta.servlet.http.HttpServletRequest;


@Controller
public class MyController {
	
	@GetMapping("/regPage")
	public String openRegPage() {
		return "register";
	}
	
	@PostMapping("/RegisterServlet")
	public String handleRegForm(HttpServletRequest req, Model model ) {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String city = req.getParameter("city");

		//Insert into DB code
		Student std = new Student();
		std.setName(name);
		std.setCity(city);
		std.setEmail(email);
		std.setGender(gender); 
		std.setPassword(password);
		
		model.addAttribute("model_std", std);
		
		
		return "profile";
	}
	
	

}
