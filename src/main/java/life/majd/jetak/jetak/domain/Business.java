package life.majd.jetak.jetak.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.GenerationType.AUTO;

@Entity @AllArgsConstructor
@Data // Creates Getters,Setters,toString, RequiredArgsConstructor
@NoArgsConstructor
public class Business {

    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;

    @ManyToOne(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
    @ElementCollection(targetClass=Address.class)
    private Address address;

    @ManyToMany
    private Collection<User> owners = new ArrayList<>();

    private String phoneNumber;

}
