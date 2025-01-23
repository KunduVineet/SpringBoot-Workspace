package in.vk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.vk.beans.Student;

public class Main {
    public static void main(String[] args) {
        // Load Spring configuration file
        @SuppressWarnings("resource")
		ApplicationContext container = new ClassPathXmlApplicationContext("in/vk/resources/applicationContext.xml");

        // Retrieve the Student bean
        Student std = container.getBean("stdObj", Student.class);

        // Call display method
        std.display();
    }
}
