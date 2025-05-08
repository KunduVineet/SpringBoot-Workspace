package in.vk.main.repo;

import java.util.List;
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
	
	int i = userRepository.countByName("Mannu");
	System.out.println(i);
	
	List<User> ve = userRepository.findByNameContaining("ma");
	ve.forEach(user ->{
		System.out.println(user.getName());
	});

	userOptional.ifPresentOrElse(user ->{
		System.out.println(user.getUser_id());
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		
	},() ->{
		System.out.println("User not found");
	});
	}

	@Test
	public void repoTest2(){
		List<User> india = userRepository.getUserByEmail("India");
		System.out.println(india.size());
	}
}

