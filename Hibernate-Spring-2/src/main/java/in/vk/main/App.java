package in.vk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vk.beans.Student;
import in.vk.dao.StudentDAO;
import in.vk.resources.SpringConfigFile;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	Student std = new Student();
    	std.setId(1);
    	std.setName("Vineet Kundu");
    	std.setRollno(112);
    	std.setCity("Gurgaon");
    	
    	
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	StudentDAO studentDAO =  (StudentDAO) applicationContext.getBean("stdDaoImpl");
    	studentDAO.addStdDetails(std);
    }
}
