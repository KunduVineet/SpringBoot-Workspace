package in.vk.main;

import java.util.Scanner;

import in.vk.beans.Student;
import in.vk.dao.StudentDAO;
import in.vk.dao.StudentDAOImplemented;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Enter your email");
		String email = sc.nextLine();
		
		System.out.println("Enter your password");
		String password = sc.nextLine();
		
		System.out.println("Enter your gender");
		String gender = sc.nextLine();
		
		System.out.println("Enter your city");
		String city = sc.nextLine();
		
		std.setName(name);
		std.setEmail(email);
		std.setPassword(password);
		std.setGender(gender);
		std.setCity(city);
		
		
		StudentDAO stdDao = new StudentDAOImplemented();
		boolean status = stdDao.addStudentDetails(std);
		
		if(status) System.out.println("Success");
		else {
			System.out.println("Failure");
		}
		
		sc.close();
	}

}
