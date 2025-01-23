package in.vk.beans;

public class Student {

	private String name;
	private int rollno;
	private String phone;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println("name :"+ name);
		System.out.println("roll no. :"+ rollno);
		System.out.println("phone : "+ phone);
	}
}
