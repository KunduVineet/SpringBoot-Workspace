package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vk.beans.Student;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(in.vk.resources.Resource.class);
		
		Student std = (Student) context.getBean(Student.class);
		std.display();
	}

}
