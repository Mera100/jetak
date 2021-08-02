package life.majd.jetak.jetak.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.GenerationType.AUTO;

@Data // Creates Getters,Setters,toString, RequiredArgsConstructor
@Entity // Tells JPA that this POJO should be persisted in a DB.
@NoArgsConstructor @AllArgsConstructor
public class ShoppingCart {

    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    @OneToMany
    private Collection<CartItem> items = new ArrayList<>();



}
