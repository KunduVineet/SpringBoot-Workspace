package in.vk.beans;

public class Student {
	private String name;
	private int id;
	
	public Student(int a) {
		System.out.println("Creating a constructor");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void display() {
		System.out.println("hii");
	}

	public static Student createStudent() {
		System.out.println("static factory method invoked");
		return new Student(10);
	}
}
