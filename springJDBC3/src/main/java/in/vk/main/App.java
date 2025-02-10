package in.vk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.vk.resources.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
    	
    	MapSqlParameterSource params = new MapSqlParameterSource();
    	params.addValue("name", "Vineet");
    	params.addValue("email", "advn@gmail.com");
    	params.addValue("gender", "Male");

    	
    	@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	NamedParameterJdbcTemplate namedParameterJdbcTemplate =  context.getBean(NamedParameterJdbcTemplate.class);
    	
    	String sql_query = "Insert INTO regs VALUES (:name, :email, :gender)";
    	int count =  namedParameterJdbcTemplate.update(sql_query, params);
    	
    	if(count >0) {
    		System.out.println("Suceess");
    	}
    	else {
    		System.out.println("failure");
    	}
    }
}
