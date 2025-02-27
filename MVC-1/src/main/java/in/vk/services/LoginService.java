package in.vk.services;

import in.vk.DAO.LoginDAO;
import in.vk.beans.User;

public class LoginService {

	public User loginService(String email , String pass) {
		LoginDAO logindao= new LoginDAO();
		User user = logindao.loginDAO(email, pass); 
		
		return user;
	}
}
