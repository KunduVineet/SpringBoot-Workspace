package in.vk.main;

import static org.springframework.security.config.Customizer.withDefaults;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    private final UserDetailsService userdetailsService;
	
	@Autowired
	DataSource dataSource;

    SecurityConfig(UserDetailsService userdetailsService) {
        this.userdetailsService = userdetailsService;
    }
	
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests((requests) -> requests.requestMatchers("/h2-console/**").permitAll()
				.anyRequest().authenticated());
		http.sessionManagement(session ->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		http.httpBasic(withDefaults());
		http.headers(headers ->
				headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin));
		http.csrf(csrf ->csrf.disable());
		return http.build();
	}
	
	//in-memory authentication
	
	@Bean
	public UserDetailsService userdetailsService() {
		
		UserDetails user1 = User.withUsername("user1")
				.password("{noop}password1")
				.roles("USER")
				.build();
		
		UserDetails admin = User.withUsername("admin")
				.password("{noop}admin1")
				.roles("ADMIN")
				.build();
		
		
		//using Db to store credentials
		JdbcUserDetailsManager userDetailsManager = new JdbcUserDetailsManager(dataSource);
		userDetailsManager.createUser(user1);
		userDetailsManager.createUser(admin);
		return userDetailsManager;
				
//		return new InMemoryUserDetailsManager(user1,admin);
	}

}
