package in.vk.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vk.main.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
