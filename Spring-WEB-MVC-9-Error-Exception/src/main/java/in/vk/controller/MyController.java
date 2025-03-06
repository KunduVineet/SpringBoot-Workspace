package in.vk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/hello2")
	public String openHelloPage() {
		
		return "hello";
	}
	
	@GetMapping("/page")
	public String pageNotFound() {
		
		return "page-not-found";
	}

}
