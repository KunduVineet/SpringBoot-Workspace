package in.vk.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vk.beans.Student;
import in.vk.factory.Factory;

@Configuration
public class Resource {
	
	@Bean
	public Factory factory() {
		return new Factory();
	}
	
	@Bean
	public Student stdobj(Factory factory){
		return factory.createStdobj();
	}

}
