package in.vk.main.repo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.vk.main.entities.User;
import in.vk.main.repository.UserRepository;

@SpringBootTest
public class UserRepo {
	
	@Autowired
	private UserRepository userRepository;

	@Test
	public void repoTest1() {
	Optional<User> userOptional = userRepository.findByEmailOrderByNameAsc("abc@gmail.com");
//	
//	userOptional.ifPresent(user ->{
//		System.out.println(user.getUser_id());
//		System.out.println(user.getName());
//		System.out.println(user.getEmail());
//		
//	});
	

	userOptional.ifPresentOrElse(user ->{
		System.out.println(user.getUser_id());
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		
	},() ->{
		System.out.println("User not found");
	});
	}
}
