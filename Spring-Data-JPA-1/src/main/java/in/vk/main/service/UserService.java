package in.vk.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vk.main.entities.User;
import in.vk.main.repository.UserRepository;

@Service 
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public User save(User user) {
		return userRepository.save(user);
	}
}
