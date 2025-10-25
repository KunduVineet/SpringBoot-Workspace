package in.vk.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.twilio.Twilio;

import in.vk.main.config.TwilioConfig;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = "in.vk")
public class MobileOtpApplication {

	@Autowired
	private TwilioConfig twilioConfig;

	@PostConstruct
	public void initTwilio(){
		Twilio.init(twilioConfig.getAccountSid(),twilioConfig.getAuthToken());
	}

	public static void main(String[] args) {
		SpringApplication.run(MobileOtpApplication.class, args);
	}

}