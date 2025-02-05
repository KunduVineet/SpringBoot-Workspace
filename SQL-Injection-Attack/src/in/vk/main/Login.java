package in.vk.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter email id");
		String myemail = sc.nextLine();
		
		System.out.println("Enter name");
		String myname = sc.nextLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection between Java and Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vkshop", "root", "8287685215");
		
		Statement st = con.createStatement();
		ResultSet rs =  st.executeQuery("SELECT * FROM regs WHERE email='"+myemail+"' AND name= '"+myname+"' ");
		
		if(rs.next()) {
			System.out.println("Welcome : "+rs.getString("name"));
		}	
		else {
			System.out.println("Invalid access");
		}
		sc.close();
	}

}
