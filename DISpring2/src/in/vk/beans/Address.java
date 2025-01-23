package in.vk.beans;

public class Address {
	private int house;
	private String city;
	private int pin;
	
	public Address(int house, String city, int pin) {
		this.house = house;
		this.city = city;
		this.pin = pin;
	}


	@Override
	public String toString() {
		return house+","+city+"-"+ pin;
	}
	

}
