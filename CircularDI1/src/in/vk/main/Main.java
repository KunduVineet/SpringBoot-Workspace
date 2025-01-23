package in.vk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vk.beans.Student;
import in.vk.beans.Teacher;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("in/vk/resources/applicationContext.xml");
		
		Student stud = (Student) context.getBean("std");
		stud.StudentDisplay();
		
		Teacher tech = (Teacher) context.getBean("tec");
		tech.TeacherDisplay();
	}
}
