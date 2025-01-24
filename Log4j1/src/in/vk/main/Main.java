package in.vk.main;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("C:/Users/kundu/Dropbox/PC/Desktop/Spring SpringBoot/Log4j1/src/in/sp/resources/log4j.properties");
		Thread.currentThread().setName("Vineet-thread");

		Logger logger = Logger.getLogger("Main");
		
		logger.fatal("This is fatal message"); 
		logger.error("This message is for error");
	}
}
