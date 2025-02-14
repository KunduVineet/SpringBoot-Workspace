package in.vk.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import in.vk.beans.Student;

public class StudentDAOImpl implements StudentDAO{
	private JdbcTemplate myJdbcTemplate;

	@Override
	public boolean addStdDetailsDao(Student std) {

		boolean status = false;
		String query = "INSERT INTO student values (?,?,?,?,?)";
		int count = myJdbcTemplate.update(query, std.getName(), std.getEmail(), std.getPassword(), std.getGender(), std.getCity());
		
		if(count >0) {
			status = true;
		}else {
			status = false;
		}
		return status;
	}

	public void setMyJdbcTemplate(JdbcTemplate myJdbcTemplate) {
		this.myJdbcTemplate = myJdbcTemplate;
	}

	

}
