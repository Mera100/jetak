package life.majd.jetak.jetak.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.GenerationType.AUTO;

@Entity @AllArgsConstructor @Data
@NoArgsConstructor
public class Business {

    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;

    @ManyToOne(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
    @ElementCollection(targetClass=Address.class)
    private Address address;
    @OneToMany(cascade= CascadeType.ALL)
    @ElementCollection(targetClass=User.class)
    private Collection<User> owners = new ArrayList<>();
    private String phoneNumber;

}
