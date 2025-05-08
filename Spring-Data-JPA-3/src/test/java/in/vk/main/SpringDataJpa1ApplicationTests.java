package in.vk.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.vk.main.dto.UserType;
import in.vk.main.entities.Address;
import in.vk.main.entities.User;
import in.vk.main.service.UserService;

@SpringBootTest
class SpringDataJpa1ApplicationTests {
	
	@Autowired
	private UserService userService;

	@Test
	public void testUser() {
		User user = new User();
		user.setUser_id(3);
		user.setName("Mannu_bkl");
		user.setEmail("mannu_noob_bkl@6gmail.com");
		user.setType(UserType.STUDENT);
		
		Address address = new Address();
		address.setCity("Gurgaon");
		address.setStreet("101");
		address.setCountry("India");
		
		user.setAddress(address);
		
		User save = userService.save(user);
		System.out.println(save.getName());
	}
	
	@Test
	public void getUserbyIdTest() {
		User user = userService.getUserbyId(2);
		System.out.println(user.getName());
	}
}
