package in.vk.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import in.vk.aspects.LoggingAspect;
import in.vk.aspects.SecurityAspect;
import in.vk.services.BankTransaction;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {
	
	@Bean
	public BankTransaction bankTransaction() {
		return new BankTransaction();
		
	}
	
	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
		
	}
	
	@Bean
	public SecurityAspect securityAspect() {
		return new SecurityAspect();
	}

}
