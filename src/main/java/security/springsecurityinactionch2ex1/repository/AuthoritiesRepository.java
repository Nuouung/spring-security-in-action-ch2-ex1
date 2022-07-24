//package security.springsecurityinactionch2ex1.repository;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Repository;
//import security.springsecurityinactionch2ex1.domain.Authorities;
//
//import javax.persistence.EntityManager;
//
//@Repository
//@RequiredArgsConstructor
//public class AuthoritiesRepository {
//
//    private final EntityManager entityManager;
//
//    public Long save(Authorities authorities) {
//        entityManager.persist(authorities);
//        return authorities.getId();
//    }
//}
