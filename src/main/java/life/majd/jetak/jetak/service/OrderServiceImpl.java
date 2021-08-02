package life.majd.jetak.jetak.service;

import life.majd.jetak.jetak.helpers.OrderStatus;
import life.majd.jetak.jetak.model.Order;
import life.majd.jetak.jetak.repository.OrderRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class OrderServiceImpl implements OrderService {

    private final OrderRepo orderRepo;


    @Override
    public Order placeOrder(Order order) {
        return orderRepo.save(order);
    }

    @Override
    public Order getOrder(Long id) {
        return null;
    }

    @Override
    public Order updateOrderStatus(Long id, OrderStatus status) {
        return null;
    }

    @Override
    public List<Order> getOrders() {
        return orderRepo.findAll();
    }
}
