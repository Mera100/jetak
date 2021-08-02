package life.majd.jetak.jetak.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data // Creates Getters,Setters,toString, RequiredArgsConstructor
public class Address {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

}
