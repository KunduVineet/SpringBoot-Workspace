package in.vk.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.vk.main.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	//Custom Method to find the user by email according to jpa standards. 
	//ReturnType findBy<Property>(Type value);
	Optional<User> findByEmailOrderByNameAsc(String email);
	List<User> findByName(String name);
	
	List<User> findByNameAndEmail(String name, String email);
	
	List<User> findByNameOrEmail(String name, String email);
	
	int countByName(String name);
	
	boolean existsByEmail(String email);
	
	List<User> findByNameContaining(String nameKeyword);
	
	List<User> findByNameLike(String pattern);
	

}
