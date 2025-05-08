package in.vk.main.service;

import org.springframework.beans.factory.annotation.Autowired;

import in.vk.main.entities.User;
import in.vk.main.repository.UserRepository;

public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public User save(User user) {
		return userRepository.save(user);
	}
}
