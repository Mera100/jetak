package life.majd.jetak.jetak.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data // Creates Getters,Setters,toString, RequiredArgsConstructor
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private Product product;
    private double quantity;
    private String notes;
}
