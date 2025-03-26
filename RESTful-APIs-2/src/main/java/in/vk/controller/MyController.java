package in.vk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.vk.beans.Student;

@RestController
public class MyController {
	
	@GetMapping("/Student")
	public Student printStdDetails() {
		Student std = new Student("mayank Arya", "Female", "GB Road");
		
		return std;
	}
}
