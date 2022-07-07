package security.springsecurityinactionch2ex1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
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

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 빈으로 등록한 UserDetailsService와 PasswordEncoder를 WebSecurityConfigurerAdapter.configure를 통해 등록한다.
        // 스프링 시큐리티의 권한 설정이 매우 유연함을 보여주는 예
        InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();

        UserDetails user = User.withUsername("test")
                .password("1234")
                .authorities("read")
                .build();

        userDetailsService.createUser(user);

        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(NoOpPasswordEncoder.getInstance());
    }
}
