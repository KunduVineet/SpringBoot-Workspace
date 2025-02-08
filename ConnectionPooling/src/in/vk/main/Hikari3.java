package in.vk.main;

import java.lang.management.ManagementFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.management.AttributeNotFoundException;
import javax.management.InstanceAlreadyExistsException;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import javax.management.ReflectionException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Hikari3 {
	public static void main(String[] args) throws MalformedObjectNameException, InstanceAlreadyExistsException, 
	NotCompliantMBeanException, InstanceNotFoundException, AttributeNotFoundException, 
	ReflectionException, MBeanException {
		
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/vkshop");
		config.setUsername("root");
		config.setPassword("8287685215");
		config.setMaximumPoolSize(10);
		
		
		try (HikariDataSource dataSource = new HikariDataSource(config)) {
			try {
				Connection con1 = dataSource.getConnection();
				Connection con2 = dataSource.getConnection();
				Connection con3 = dataSource.getConnection();

				
				PreparedStatement ps = con1.prepareStatement("INSERT INTO regs VALUES(?,?,?)");
				
				//register HikariCP pool as an MBean
				MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
				ObjectName poolObjectName = new ObjectName("com.zaxxer.hikari:type=Pool("+dataSource.getPoolName()+")");
				mBeanServer.registerMBean(dataSource.getHikariPoolMXBean(), poolObjectName);
				
				//Access the pool statistics using JMX attributes
				int activeConnection =  (int) mBeanServer.getAttribute(poolObjectName, "ActiveConnections");
				int idleConnection =  (int) mBeanServer.getAttribute(poolObjectName, "IdleConnections");
				int totalConnection = activeConnection + idleConnection;
				
				System.out.println("Active Connection : "+activeConnection);
				System.out.println("Idle Connection : "+idleConnection);
				System.out.println("Total Connection : "+totalConnection);
				
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
				con1.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
