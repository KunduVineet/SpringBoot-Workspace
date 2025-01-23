package in.vk.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import in.vk.beans.Student;

@Configuration
@PropertySource("in/vk/resources/student.properties")
public class SpringConfigFile {
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.roll}")
	private int rollno;

	@Bean("stdId")
	public Student stdObj() {
		Student std = new Student();
		
		std.setName(name);
		std.setRollno(rollno);
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		
		std.setSubjects(list);
		
		return std;
	}
}
