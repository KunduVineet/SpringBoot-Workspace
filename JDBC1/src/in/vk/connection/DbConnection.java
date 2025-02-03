package in.vk.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConnection {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//load and register Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//Establish the connection between Java and Database
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vkshop", "root", "8287685215");
	
//	PreparedStatement ps = con.prepareStatement("INSERT INTO regs VALUES('VineetKundu','kunduvineet6@gmail.com','male')");
	
	PreparedStatement ps = con.prepareStatement("INSERT INTO regs VALUES(?,?,?)");
	ps.setString(1, "Mannu");
	ps.setString(2, "mannu@gmail.com");
	ps.setString(3, "female");

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
