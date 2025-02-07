package in.vk.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Mainstar {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vkshop", "root", "8287685215");
			
			con.setAutoCommit(false);

			PreparedStatement ps = con.prepareStatement("INSERT INTO regs VALUES(?,?,?)");
			ps.setString(1, "Mannu-Gangster");
			ps.setString(2, "mannu@gmail.com");
			ps.setLong(3, 99);

			int count = ps.executeUpdate();
			if (count > 0) {
				con.commit();
				System.out.println("User inserted succesfully");
			} else {
				con.rollback();
				System.out.println("User not inserted");
			}

			ps.close();
			con.close();

			System.out.println("success");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
