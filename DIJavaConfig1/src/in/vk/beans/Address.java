package in.vk.beans;

public class Address {
	private int house;
	private String city;
	private int pin;
	public int getHouse() {
		return house;
	}
	public void setHouse(int house) {
		this.house = house;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return ":"+ house + "," + city + "-" + pin ;
	}
	
	

}
