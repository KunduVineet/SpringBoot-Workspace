package in.vk.factory;

import in.vk.beans.Student;

public class Factory {
	
	public Student createStdobj() {
		System.out.println("factory");
		Student std = new Student(90);
		return std;
	}

}
