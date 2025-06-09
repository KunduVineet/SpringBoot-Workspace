package in.vk.main.entities;

import in.vk.main.dto.UserType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;

@Entity
public class User {
	
	@Id
	@Column(name = "Id")
	private int user_id;
	
	@Column(nullable = false)
	private String name;
	
	private String email;
	
	@Transient
	private String extra_info;
	
	@Enumerated(EnumType.STRING)
	private UserType type = UserType.DIRECTOR;
	
	@Embedded
	private Address address;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public String getExtra_info() {
		return extra_info;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setExtra_info(String extra_info) {
		this.extra_info = extra_info;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	@Enumerated(EnumType.STRING)
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
	

}
