package security.springsecurityinactionch2ex1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import security.springsecurityinactionch2ex1.service.InMemoryUserDetailsService;

import javax.sql.DataSource;
import java.util.List;

@Configuration
public class ProjectConfig {

//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user = new User("jinseok", "1234", List.of(() -> "read"));
//        List<UserDetails> users = List.of(user);
//        return new InMemoryUserDetailsService(users);
//    }

    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
