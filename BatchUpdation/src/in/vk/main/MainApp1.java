package in.vk.main;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			//load and register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the connection between Java and Database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vkshop", "root", "8287685215");
			
			Statement st = con.createStatement();
			st.addBatch("INSERT INTO regs VALUES('Shivam', 'shivam6@gmail.com', 'shemale')");
			st.addBatch("INSERT INTO regs VALUES('Suman', 'suman6@gmail.com', 'shemale')");
			
			int[] count = st.executeBatch();
			for(@SuppressWarnings("unused") int i:count) {
				System.out.println(1+"sucess");
			}
			con.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
