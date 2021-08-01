package life.majd.jetak.jetak.model;

import life.majd.jetak.jetak.helpers.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    private Collection<Product> products = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @ElementCollection(targetClass = User.class)
    private User costumer;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @ElementCollection(targetClass = Business.class)
    private Business business;

    private OrderStatus status;


}
