package in.vk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vk.beans.Student;
import in.vk.resources.springConfig;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(springConfig.class);
		
		Student std = (Student) context.getBean(Student.class);
		std.display();
	}
}
