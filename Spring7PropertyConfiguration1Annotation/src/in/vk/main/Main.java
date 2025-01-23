package in.vk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.vk.beans.Student;

public class Main {
    public static void main(String[] args) {
        // Load Spring configuration file
        @SuppressWarnings("resource")
		ApplicationContext container = new AnnotationConfigApplicationContext();
        
        
        Student std = (Student) container.getBean("student");
        std.display();
    }
}
