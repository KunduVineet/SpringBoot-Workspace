package in.vk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.vk.beans.Student;
import in.vk.dbcon.DbConnection;

public class StudentDAOImplemented implements StudentDAO {

	public boolean addStudentDetails(Student std) {

		boolean status = false;
		try {

			Connection con = DbConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setString(1, std.getName());
			ps.setString(2, std.getPassword());
			ps.setString(3, std.getGender());
			ps.setString(4, std.getCity());
			ps.setString(5, std.getEmail());

			int count = ps.executeUpdate();
			if (count > 0) {
				status = true;
			} else {
				status = false;
			}
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
			// TODO: handle exception

		}
		return status;
	}

}
