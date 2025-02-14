package in.vk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vk.beans.Student;
import in.vk.resources.SpringConfig;
import in.vk.services.StudentService;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	Student std = context.getBean(Student.class);

    	StudentService stdService = context.getBean(StudentService.class);
    	boolean status = stdService.addStdDetailsService(std);
    	
    	if(status) {
    		System.out.println("Success");
    	}
    	else {
    		System.out.println("Failure");
    	}
    }
}
