package in.vk.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vk.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean("stdId")
	public Student stdObj() {
		Student std = new Student();
		std.setName("Vineet Kundu");
		std.setRollno(12345);
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		
		std.setSubjects(list);
		
		return std;
	}
}
