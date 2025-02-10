package in.vk.main;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class App 
{
    public static void main( String[] args )
    {
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
    	
    	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    	dataSource.setUrl("jdbc:mysql://localhost:3306/vkshop");
    	dataSource.setUsername("root");
    	dataSource.setPassword("8287685215");
    	
    	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    	
    	try {
			Connection con = jdbcTemplate.getDataSource().getConnection();
			if(con != null) {
		    	System.out.println("success");
			}	else {
				System.out.println("Failure");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();

		}
    }
}
