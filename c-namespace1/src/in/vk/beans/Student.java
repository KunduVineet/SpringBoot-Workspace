package in.vk.beans;

public class Student {
	private String name;
	private int rollno;
	private float marks;

	public Student(String name, int rollno, float marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Roll no. : " + rollno);
		System.out.println("Marks : " + marks);

	}

}
