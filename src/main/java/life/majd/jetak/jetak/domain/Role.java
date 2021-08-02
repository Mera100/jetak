package life.majd.jetak.jetak.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Data // Creates Getters,Setters,toString, RequiredArgsConstructor
@Entity // Tells JPA that this POJO should be persisted in a DB.
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;

}
