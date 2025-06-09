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
        // Create a new user if none exists
        User user = userRepository.findById(1).orElse(new User());
        if (user.getUser_id() == 0) {
            user.setName("Test User");
            user = userRepository.save(user);
        }

        // Create a new laptop
        Laptop laptop = new Laptop();
        laptop.setModel("ASUS 5G");
        laptop.setAbout("Latest and Advanced");

        // Set up the relationship
        user.setLaptop(laptop);
        laptop.setUser(user);

        // Save the user
        userRepository.save(user);

        System.out.println("Laptop added");
    }
}