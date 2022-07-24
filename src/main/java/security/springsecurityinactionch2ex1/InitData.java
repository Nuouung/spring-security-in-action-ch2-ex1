//package security.springsecurityinactionch2ex1;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//import security.springsecurityinactionch2ex1.domain.Authorities;
//import security.springsecurityinactionch2ex1.domain.User;
//import security.springsecurityinactionch2ex1.repository.AuthoritiesRepository;
//import security.springsecurityinactionch2ex1.repository.UserRepository;
//import security.springsecurityinactionch2ex1.service.UserService;
//
//import javax.annotation.PostConstruct;
//
//@Component
//@RequiredArgsConstructor
//public class InitData {
//
//    private final UserService userService;;
//
//    @PostConstruct
//    public void initData() {
//        User user = new User();
//        user.setUsername("sogi");
//        user.setPassword("1234");
//        user.setEnabled(true);
//
//        Authorities authorities = new Authorities();
//        authorities.setUser(user);
//        authorities.setAuthority("write");
//
//        userService.saveUser(user);
//        userService.saveAuthorities(authorities);
//    }
//}
