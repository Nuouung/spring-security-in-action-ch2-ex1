//package security.springsecurityinactionch2ex1.service;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import security.springsecurityinactionch2ex1.domain.Authorities;
//import security.springsecurityinactionch2ex1.domain.User;
//import security.springsecurityinactionch2ex1.repository.AuthoritiesRepository;
//import security.springsecurityinactionch2ex1.repository.UserRepository;
//
//@Service
//@Transactional
//@RequiredArgsConstructor
//public class UserService {
//
//    private final UserRepository userRepository;
//    private final AuthoritiesRepository authoritiesRepository;
//
//    public void saveUser(User user) {
//        userRepository.save(user);
//    }
//
//    public void saveAuthorities(Authorities authorities) {
//        authoritiesRepository.save(authorities);
//    }
//}
