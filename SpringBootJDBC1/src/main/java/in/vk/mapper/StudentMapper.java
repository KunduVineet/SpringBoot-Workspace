package in.vk.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.vk.beans.Student;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		String name1 = rs.getString("name");
		String email1 = rs.getString("email");
		String pass1 = rs.getString("password");
		String gender1 = rs.getString("gender");
		String city1 = rs.getString("city");
		
		Student student = new Student();
		student.setName(name1);
		student.setEmail(email1);
		student.setPassword(pass1);
		student.setCity(city1);
		student.setGender(gender1);

		return null;
	}

}
