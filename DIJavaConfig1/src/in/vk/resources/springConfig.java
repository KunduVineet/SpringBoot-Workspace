package in.vk.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vk.beans.Address;
import in.vk.beans.Student;

@Configuration
public class springConfig {
	
	@Bean
	public Address createAdd() {
		Address addr = new Address();
		addr.setCity("Gurgaon");
		addr.setHouse(23);
		addr.setPin(12001);
		return addr;
	}
	
	@Bean
	public Student createStd() {
		Student std = new Student();
		std.setName("Vineet Kundu");
		std.setId(112);
		std.setAddress(createAdd());	//Dependency Injection
		return std;
	}

}
