package in.vk.beans;

public class Student {
	private String name;
	private int id;
	private Address address;

	public Student(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public void display() {
		System.out.println("name " + name);
		System.out.println("id " + id);
		System.out.println("address " + address);

	}

}
