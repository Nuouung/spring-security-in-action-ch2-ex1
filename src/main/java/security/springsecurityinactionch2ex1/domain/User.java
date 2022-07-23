package security.springsecurityinactionch2ex1.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class User {

    @Id
    private Long id;

    private String username;
    private String password;

    private String authority;
}
