package in.vk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.vk.beans.Student;
import in.vk.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
        // Load Spring configuration file
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        // Retrieve the Student bean
        Student std = context.getBean("stdId", Student.class);

        // Call display method
        std.display();
    }
}
