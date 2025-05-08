package in.vk.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.vk.main.dto.UserType;
import in.vk.main.entities.User;
import in.vk.main.service.UserService;

@SpringBootTest
class SpringDataJpa1ApplicationTests {
	
	@Autowired
	private UserService userService;

	@Test
	public void testUser() {
		User user = new User();
		user.setUser_id(2);
		user.setName("Mannu");
		user.setEmail("mannu_noob@6gmail.com");
		user.setType(UserType.STUDENT);
		
		User save = userService.save(user);
		System.out.println(save.getName());
	}
}
