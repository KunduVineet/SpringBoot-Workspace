package in.vk.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class Main {
	
	public static void main(String[] args) {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setURL("jdbc:mysql://localhost:3306/vkshop");
		dataSource.setUser("root");
		dataSource.setPassword("8287685215");
		
		try {
			Connection con = dataSource.getConnection();
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO regs VALUES(?,?,?)");
			ps.setString(1, "Menu");
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
