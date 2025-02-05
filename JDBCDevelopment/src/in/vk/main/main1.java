package in.vk.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class main1 {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null;

		final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		final String URL = "jdbc:mysql://localhost:3306/vkshop";
		final String USER = "root";
		final String PASS = "8287685215";
		try {

			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL, USER, PASS);

			String sql_query = "INSERT INTO regs VALUES(?,?,?)";
			ps = con.prepareStatement(sql_query);
			ps.setString(1, "Shivam");
			ps.setString(2, "shivam@gmail.com");
			ps.setString(3, "shemale");

			int count = ps.executeUpdate();
			if (count > 0) {
				System.out.println("User inserted succesfully");
			} else {
				System.out.println("User not inserted");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
