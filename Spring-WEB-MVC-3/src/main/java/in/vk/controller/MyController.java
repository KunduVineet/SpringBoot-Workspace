package in.vk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MyController {
	
	@RequestMapping("/aa")
	public String open() {
		return "hello";
	}
//	
//	@PostMapping("/myForm")
//	public String getFormName(HttpServletRequest req, HttpServletResponse resp, Model model) {
//		
//		String myname = req.getParameter("name");
//		model.addAttribute("model_name", myname);
//		return "hello";
//	}
	
	@PostMapping("/myForm")
	public ModelAndView getFormname(HttpServletRequest req, HttpServletResponse resp) {
	String myname = req.getParameter("name");

		ModelAndView mav = new ModelAndView();
		mav.addObject("model_name", myname);
		mav.setViewName("hello");
		
		return mav;
	}
}
