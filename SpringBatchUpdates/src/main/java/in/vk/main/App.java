package in.vk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import in.vk.resources.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
    	
    	@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	JdbcTemplate jdbcTemplate =  context.getBean(JdbcTemplate.class);
    	
    	String sql_query1 = "Insert INTO regs VALUES ('nm', 'mail', 'nder')";
    	String sql_query2 = "Insert INTO regs VALUES ('name', 'email1', 'gender1')";

    	int [] count = jdbcTemplate.batchUpdate(sql_query1, sql_query2);
    	for(int i : count) {
    		System.out.println(i +"Suceess");
    	}
    	
    }
}
