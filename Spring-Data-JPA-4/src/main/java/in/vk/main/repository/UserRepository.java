package in.vk.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.vk.main.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	//Custom Method to find the user by email according to jpa standards. 
	//ReturnType findBy<Property>(Type value);
	
	//Query Methods
	Optional<User> findByEmailOrderByNameAsc(String email);
	
	List<User> findByName(String name);
	
	List<User> findByNameAndEmail(String name, String email);
	
	List<User> findByNameOrEmail(String name, String email);
	
	int countByName(String name);
	
	boolean existsByEmail(String email);
	
	List<User> findByNameContaining(String nameKeyword);
	
	List<User> findByNameLike(String pattern);
	
	//Manually Defined Queries
	
	@Query(value = "SELECT * FROM jpa_db", nativeQuery = true)
	public List<User> getUsers();
	
	@NativeQuery(value = "SELECT * FROM jpa_db where email = :email")
	public List<User> getUsersByEmail(@Param("email") String email);
	
	@NativeQuery(value = "SELECT * FROM jpa_db where email = :email and name =:name")
	public List<User> getUsersByEmailAndName(@Param("email") String email, @Param("name") String name);
	

}
