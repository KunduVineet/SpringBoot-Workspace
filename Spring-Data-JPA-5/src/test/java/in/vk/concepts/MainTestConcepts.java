package in.vk.concepts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.vk.main.entities.Laptop;
import in.vk.main.entities.User;
import in.vk.main.repository.LaptopRepo;
import in.vk.main.repository.UserRepository;

@SpringBootTest // Specify main app class if needed
public class MainTestConcepts {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LaptopRepo laptopRepo;

    @Test
    public void testOneToOne() {
        // Ensure a user exists
        User user = userRepository.findById(1).orElseThrow(() -> new RuntimeException("User not found"));

        // Create a new laptop
        Laptop laptop = new Laptop();
        laptop.setModel("ASUS 5G");
        laptop.setAbout("Latest and Advanced");

        // Set up the relationship
        user.setLaptop(laptop);
        laptop.setUser(user);

        // Save the user (or laptop, depending on cascade settings)
        userRepository.save(user); // Assuming User is the owning side
    }
}