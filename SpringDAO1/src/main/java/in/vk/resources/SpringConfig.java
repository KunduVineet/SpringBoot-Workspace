package in.vk.resources;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.vk.beans.Student;
import in.vk.dao.StudentDAO;
import in.vk.dao.StudentDAOImpl;
import in.vk.services.StudentServiceImpl;

@Configuration
public class SpringConfig {

	@Bean
	public DataSource myDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/dao_db");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("8287685215");
		
		return driverManagerDataSource;
	}
	
	@Bean
	public JdbcTemplate myJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(myDataSource());
		return jdbcTemplate;
	}
	

	@Bean
	public StudentDAO createStdDaoImplObj() {
		StudentDAOImpl stdDaoImpl = new StudentDAOImpl();
		stdDaoImpl.setMyJdbcTemplate(myJdbcTemplate());
		return stdDaoImpl;
	}
	
	@Bean
	public StudentServiceImpl createStdServiceImplObj() {
		StudentServiceImpl studentDAOImpl = new StudentServiceImpl();
		studentDAOImpl.setStdDao(createStdDaoImplObj());
		return studentDAOImpl;
	}
	
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		
		std.setName("VK");
		std.setEmail("kv@gmail.com");
		std.setPassword("kvkv_vkvk");
		std.setGender("male");
		std.setCity("Gurgaon");
		
		return std;
	}
}
