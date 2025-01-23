package in.vk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vk.beans.Student;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("in/vk/resources/applicationContext.xml");
		
		Student std = (Student) context.getBean("stdObj");
		std.display();
	}
}
