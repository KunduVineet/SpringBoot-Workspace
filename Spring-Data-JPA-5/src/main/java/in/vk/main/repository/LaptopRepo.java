package in.vk.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vk.main.entities.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop, Integer>{

}
