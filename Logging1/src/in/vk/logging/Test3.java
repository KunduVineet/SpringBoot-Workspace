package in.vk.logging;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test3 {
	
	public static void main(String[] args) {
		try {
			
			System.out.println("Main method starts");
			
			FileHandler fileHandler = new FileHandler("C:\\Users\\kundu\\Dropbox\\PC\\Desktop\\logfile.log");
			SimpleFormatter simpleFormatter = new SimpleFormatter();
			fileHandler.setFormatter(simpleFormatter);
			
			Logger logger = Logger.getLogger("Test2");
			logger.addHandler(fileHandler);
			
			logger.log(Level.SEVERE, "server is unreachable");

			logger.log(Level.WARNING, "do not try this");

			System.out.println("Main method ends");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
