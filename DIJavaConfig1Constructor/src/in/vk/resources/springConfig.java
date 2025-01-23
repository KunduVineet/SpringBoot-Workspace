package in.vk.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vk.beans.Address;
import in.vk.beans.Student;

@Configuration
public class springConfig {
	
	@Bean
	public Address createAdd() {
		Address addr = new Address(542, "Gurgaon -", 122001);
		
		return addr;
	}
	
	@Bean
	public Student createStd() {
		Student std = new Student("Mayank", 790, createAdd());
		
		return std;
	}

}
