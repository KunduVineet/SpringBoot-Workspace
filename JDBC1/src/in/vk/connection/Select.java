package in.vk.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection between Java and Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vkshop", "root", "8287685215");
				
		PreparedStatement ps = con.prepareStatement("SELECT * FROM regs");
		ResultSet rs = ps.executeQuery();
		

		while(rs.next()) {
			String myname = rs.getString("name");
			System.out.println("Name : "+myname);
		}
		ps.close();
		con.close();
		
		System.out.println("success");
	}


}
