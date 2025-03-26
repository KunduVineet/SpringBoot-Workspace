package in.vk.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("in.vk")
public class ResTfulApIs1Application {

	public static void main(String[] args) {
		SpringApplication.run(ResTfulApIs1Application.class, args);
	}

}
