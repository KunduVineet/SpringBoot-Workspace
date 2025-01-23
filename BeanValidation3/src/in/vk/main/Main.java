package in.vk.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import in.vk.beans.Student;
import in.vk.beans.StudentValidator;

public class Main {
	public static void main(String[] args) {
		// Load Spring configuration file
		ApplicationContext container = new ClassPathXmlApplicationContext("in/vk/resources/applicationContext.xml");

		// Retrieve the Student bean
		Student std = (Student) container.getBean("stdObj");

		// Data binder is a class in Spring used for data binding.
		//It is responsible for binding the data from HTTP Requests parameters to java objects.
		
		StudentValidator stdValidator =  (StudentValidator) container.getBean("stdValId");
		
		Map<String, Object> map = new HashMap<String, Object>();
		MapBindingResult mapBindingResult = new MapBindingResult(map, "mymap");
		
		stdValidator.validate(std, mapBindingResult);
		
		List<ObjectError> list = mapBindingResult.getAllErrors();
		
		if(list.isEmpty()) {
			std.display();
		}	else {
			for(ObjectError oe: list) {
				System.err.println(oe.getDefaultMessage());
			}
		}
	}
}
