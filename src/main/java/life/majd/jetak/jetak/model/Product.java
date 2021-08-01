package life.majd.jetak.jetak.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private double price;
    @ManyToOne(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
    @ElementCollection(targetClass=Business.class)
    private Business business;
}
