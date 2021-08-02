package life.majd.jetak.jetak.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.GenerationType.AUTO;

@Data // Creates Getters,Setters,toString, RequiredArgsConstructor
@Entity // Tells JPA that this POJO should be persisted in a DB.
@AllArgsConstructor @NoArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @ElementCollection(targetClass=Address.class)
    private Address address;
    @ManyToMany
    private Collection<Role> roles = new ArrayList<>();
    private boolean isActive;
}
