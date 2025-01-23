package in.vk.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test2 {
	static Logger logger;

	void m1() {
		System.out.println("M1 method starts");

		logger.log(Level.SEVERE, "server is unreachable");

		logger.log(Level.WARNING, "do not try this");

		System.out.println("M1 method ends");

	}

	public static void main(String[] args) {
		System.out.println("Main method starts");
		
		logger = Logger.getLogger("Test2");
		
		Test2 obj = new Test2();
		obj.m1();


		logger.log(Level.SEVERE, "server is unreachable");

		logger.log(Level.WARNING, "do not try this");

		System.out.println("Main method ends");

	}

}
