package in.vk.beans;

public class Student {

	private String name;
	private int rollno;
	
	public String getName() {
		System.out.println("name getter method");
		return name;
	}
	public void setName(String name) {
		System.out.println("name setter method");
		this.name = name;
	}
	public int getRollno() {
		System.out.println("roll getter method");
		return rollno;
	}
	public void setRollno(int rollno) {
		System.out.println("roll setter method");
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println("name :"+ name);
		System.out.println("roll no. :"+ rollno);
	}
}
