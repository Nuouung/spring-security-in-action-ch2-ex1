//package security.springsecurityinactionch2ex1.repository;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Repository;
//import security.springsecurityinactionch2ex1.domain.User;
//
//import javax.persistence.EntityManager;
//
//@Repository
//@RequiredArgsConstructor
//public class UserRepository {
//
//    private final EntityManager entityManager;
//
//    public Long save(User user) {
//        entityManager.persist(user);
//        return user.getId();
//    }
//}
