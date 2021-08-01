package life.majd.jetak.jetak.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @ElementCollection(targetClass=Address.class)
    private Address address;
    @ManyToMany
    private Collection<Role> roles = new ArrayList<>();
}
