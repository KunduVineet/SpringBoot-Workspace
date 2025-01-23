package in.vk.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vk.beans.Address;
import in.vk.beans.Student;

@Configuration
public class springConfig {

	@Bean
	public Address addr() {
		Address add = new Address();

		add.setHouse(23);
		add.setCity("Gurgaon");
		add.setPin(90);

		return add;
	}

	@Bean
	public Student std() {
		Student std = new Student();

		//std.setAddress(addr());
		std.setName("mA");
		std.setRollno(12);

		return std;
	}
}
