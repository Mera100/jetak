package life.majd.jetak.jetak.repository;

import life.majd.jetak.jetak.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long>{
}
