package in.vk.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection between Java and Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vkshop", "root", "8287685215");
				
		PreparedStatement ps = con.prepareStatement("UPDATE regs SET gender=? WHERE name=?");
		ps.setString(1, "sheMale");
		ps.setString(2, "mannu");
		

		int count = ps.executeUpdate();
		if(count >0) {
			System.out.println("User inserted succesfully");
		}
		else {
			System.out.println("User not inserted");
		}
		
		ps.close();
		con.close();
		
		System.out.println("success");
	}


}
