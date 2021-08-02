package life.majd.jetak.jetak.repository;

import life.majd.jetak.jetak.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long>{
    List<Order> findByCustomer(String customerName);
}
