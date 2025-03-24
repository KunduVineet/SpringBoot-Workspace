package in.vk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.vk.beans.Student;

@Repository
public class RegisterDAOImpl implements RegisterDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean RegisterDao(Student std) {
		 String mysql_query = "INSERT INTO REGISTER VALUES (?,?,?,?,?)";
	      
		 boolean status = false;
	        try {
	            int count = jdbcTemplate.update(mysql_query, new Object[] {std.getName(), std.getEmail(), std.getPassword(), std.getCity(), std.getGender()});
	            if(count >0) {
	            	status = true;
	            }	else {
	            	status = false;
	            }
	        } catch (Exception e) {
            	status = false;
	        	e.printStackTrace();
	        }

	        return status;
	}

}
