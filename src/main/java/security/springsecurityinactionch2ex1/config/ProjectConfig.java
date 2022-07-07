package security.springsecurityinactionch2ex1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.httpBasic();

        http.authorizeRequests()
                .anyRequest().authenticated(); // 모든 사용자에게 인증을 요구하다. <- 기본(default) 인증 설정과 같은 방식

//        http.authorizeRequests()
//                .anyRequest().permitAll(); // 모든 사용자에게 인증을 요구하지 않는다.
    }

    @Bean
    public UserDetailsService userDetailsService() {
        // InMemoryUserDetailManager를 스프링 빈으로 등록한다. (기본적으로 장착되어 있는 UserDetailService 대체)
        InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();

        // username과 비밀번호, 권한을 가진 임의의 회원을 생성한다.
        UserDetails user = User.withUsername("test")
                .password("1234")
                .authorities("read")
                .build();

        // InMemoryUserDetailManager가 생성한 회원을 관리하도록 한다.
        userDetailsService.createUser(user);

        return userDetailsService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
