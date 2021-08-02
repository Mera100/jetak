package life.majd.jetak.jetak.repository;

import life.majd.jetak.jetak.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
