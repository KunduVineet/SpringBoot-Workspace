package in.vk.main.entities;

import in.vk.main.dto.UserType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
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
	
	private UserType type = UserType.STUDENT;
	
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
