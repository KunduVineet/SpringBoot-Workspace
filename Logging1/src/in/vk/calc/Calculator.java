package in.vk.calc;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Calculator {

	public static void main(String[] args) throws SecurityException, IOException {
		
		FileHandler fileHandler = new FileHandler("C:\\Users\\kundu\\Dropbox\\PC\\Desktop\\logfile.log", true);
		SimpleFormatter simpleFormatter = new SimpleFormatter();
		fileHandler.setFormatter(simpleFormatter);
		
		Logger logger = Logger.getLogger("Calculator");
		logger.addHandler(fileHandler);
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number 1");
			int n1 = sc.nextInt();
			logger.log(Level.INFO, "User has provided no. 1"+ n1);

			System.out.println("Enter no. 2");
			int n2 = sc.nextInt();
			logger.log(Level.INFO, "User has provided no. 2"+ n2);


			System.out.println("Select any 1 symbol (+,-,*,/,%)");
			String symbol = sc.next();
			logger.log(Level.INFO, "User has provided symbol"+ symbol);

			int ans;

			switch (symbol) {
			case "+":
				ans = n1 + n2;
				System.out.println("Sum is " + ans);
				logger.log(Level.INFO, "Result is"+ ans);
				break;

			case "-":
				ans = n1 - n2;
				System.out.println("Difference is " + ans);
				logger.log(Level.INFO, "Result is"+ ans);
				break;

			case "*":
				ans = n1 * n2;
				System.out.println("Product is " + ans);
				logger.log(Level.INFO, "Result is"+ ans);
				break;

			case "/":
				ans = n1 / n2;
				System.out.println("Division is " + ans);
				logger.log(Level.INFO, "Result is"+ ans);
				break;
				
			case "%":
				ans = n1 % n2;
				System.out.println("Percentage is " + ans);
				logger.log(Level.INFO, "Result is"+ ans);
				break;
				
			default:
				System.out.println("Invalid symbol");
				logger.log(Level.INFO, "Invalid symbol");


			}
		}
	}

}
