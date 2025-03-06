package in.vk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.vk.beans.Student;
import jakarta.validation.Valid;

@Controller
public class MyController {
	
	@GetMapping("/regPage")
	public String openRegPage(Model model) {
		model.addAttribute("modelStd", new Student());
		return "register";
	}
	
	@PostMapping("/RegisterServlet")
	public String handleRegForm(@ModelAttribute("model_std") Student std, BindingResult br) {		
		if(br.hasErrors()) {
			return "register";
		} else {
			return "profile";
		}
	}
	
}
