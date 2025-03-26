package in.vk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.vk.beans.Student;

@RestController
public class MyController {
	
	@GetMapping("/Student")
	public Student printStdDetails() {
		Student std = new Student();
		std.setName("Vineet Kundu");
		std.setGender("Male");
		std.setCity("Gurgaon");
		
		return std;
	}
}
