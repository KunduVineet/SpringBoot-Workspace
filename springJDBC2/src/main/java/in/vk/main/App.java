package in.vk.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.vk.resources.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
    	Map<String, Object> map = new HashMap<String, Object>();
    	map.put("name", "Vineet");
    	map.put("email", "advn@gmail.com");
    	map.put("gender", "Male");

    	
    	@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	NamedParameterJdbcTemplate namedParameterJdbcTemplate =  context.getBean(NamedParameterJdbcTemplate.class);
    	
    	String sql_query = "Insert INTO regs VALUES (:name, :email, :gender)";
    	int count =  namedParameterJdbcTemplate.update(sql_query, map);
    	
    	if(count >0) {
    		System.out.println("Suceess");
    	}
    	else {
    		System.out.println("failure");
    	}
    }
}
