package in.vk.main.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		DefaultSecurityFilterChain build = http.build();
		
		//Springboot API security 
		http.authorizeHttpRequests(httpRequest -> {
			httpRequest.requestMatchers("/admin/result").authenticated();
			httpRequest.requestMatchers("/admin/get-results").authenticated();
			httpRequest.anyRequest().permitAll();
			
		});
		
		http.formLogin(formLogin ->{
			formLogin.loginPage("/login")
			.successForwardUrl("/admin/add-results")
			.failureForwardUrl("/user-login")
			.permitAll(true);
		}).logout(Customizer.withDefaults());
		return build;
		
	}

}
