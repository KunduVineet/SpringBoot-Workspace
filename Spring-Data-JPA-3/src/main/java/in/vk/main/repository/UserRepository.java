package in.vk.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vk.main.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	//Custom Method to find the user by email according to jpa standards. 
	//ReturnType findBy<Property>(Type value);
	Optional<User> findByEmail(String value);
	Optional<List<User>> findByName(String name);
	
	Optional<List<User>> findByNameAndEmail(String name, String email);
	
	Optional<List<User>> findByNameOrEmail(String name, String email);
}
