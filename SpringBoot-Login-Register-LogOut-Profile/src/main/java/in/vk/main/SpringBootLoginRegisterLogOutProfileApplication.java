package in.vk.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"in.vk"})
public class SpringBootLoginRegisterLogOutProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoginRegisterLogOutProfileApplication.class, args);
	}

}
