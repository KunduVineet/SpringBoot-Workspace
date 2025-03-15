package in.vk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/aaa")
	public String openHelloPage() {
		return "Hello";
	}
	

}
