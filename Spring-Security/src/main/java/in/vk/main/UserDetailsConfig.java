package in.vk.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import javax.sql.DataSource;

@Configuration
public class UserDetailsConfig {

    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource) {
        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);
        // Optionally customize queries if needed
        // manager.setUsersByUsernameQuery("select username, password, enabled from users where username = ?");
        // manager.setAuthoritiesByUsernameQuery("select username, authority from authorities where username = ?");
        return manager;
    }
}