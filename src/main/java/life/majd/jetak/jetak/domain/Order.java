package life.majd.jetak.jetak.domain;

import life.majd.jetak.jetak.helpers.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Data // Creates Getters,Setters,toString, RequiredArgsConstructor
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @ElementCollection(targetClass = ShoppingCart.class)
    private ShoppingCart shoppingCart;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @ElementCollection(targetClass = User.class)
    private User customer;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @ElementCollection(targetClass = Business.class)
    private Business business;

    private OrderStatus status;

    @ManyToMany
    private User courier;


}
