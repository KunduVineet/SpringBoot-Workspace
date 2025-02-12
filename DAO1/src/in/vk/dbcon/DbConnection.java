package in.vk.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	static Connection con;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dao_db", "root", "8287685215");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
}
