package in.vk.main;

import in.vk.beans.Address;
import in.vk.beans.Student;

public class Main {
	
	public static void main(String [] args) {
		Address addr = new Address();
		
		addr.setHouse(145);
		addr.setCity("Gurgaon");
		addr.setPin(122001);
		
		Student std = new Student();
		std.setName("Vineet Kundu");
		std.setRollno(3436);
		std.setAddress(addr);
		
		std.display();
		
	}

}
