package in.vk.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("hello1");
		
		Logger logger = Logger.getLogger("Test1");
		
		logger.log(Level.SEVERE,"This is very important message"); 
		
		logger.log(Level.WARNING,"This is message"); 
		
		System.out.println("hello2");
		
	}

}
