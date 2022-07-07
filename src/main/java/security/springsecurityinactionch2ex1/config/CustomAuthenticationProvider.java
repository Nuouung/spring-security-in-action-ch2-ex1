package security.springsecurityinactionch2ex1.config;

import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName();
        String password = String.valueOf(authentication.getCredentials());

        // UserDetailsService와 PasswordEncoder를 아래의 로직으로 교체. (다운스트림으로 이동하지 않고 로직을 처리 <- 스프링 시큐리티 아키텍처를 준수하지 않은 것!)
        if ("test".equals(username) &&
            "1234".equals(password)) {
            return new UsernamePasswordAuthenticationToken(username, password, Arrays.asList());
        }

        throw new AuthenticationCredentialsNotFoundException("Error in authentication!");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class
                .isAssignableFrom(authentication);
    }
}
