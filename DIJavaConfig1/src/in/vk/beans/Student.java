package in.vk.beans;

public class Student {
	private String name; 
	private int id;
	private Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("name "+name);
		System.out.println("id "+id);
		System.out.println("address "+address);

	}

}
