package in.vk.DAO;

import in.vk.beans.User;

public class LoginDAO {

	public User loginDAO(String email, String password) {
		User user = null;
		if(email.equals("kunduvineet2@gmail.com") && password.equals("vineet")) {
			user = new User();
			user.setName("Vineet");
			user.setEmail("kunduvineet6@gmail.com");
			user.setCity("Gurgaon");
		}
		return user;
	}
}
