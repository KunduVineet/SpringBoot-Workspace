package in.vk.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Hikari {
	public static void main(String[] args) {
		
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/vkshop");
		config.setUsername("root");
		config.setPassword("8287685215");
		config.setMaximumPoolSize(10);
		
		try (HikariDataSource dataSource = new HikariDataSource(config)) {
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

}
