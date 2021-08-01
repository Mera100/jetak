package life.majd.jetak.jetak.service;

import life.majd.jetak.jetak.helpers.OrderStatus;
import life.majd.jetak.jetak.model.Order;

import java.util.List;

public interface OrderService {

    Order placeOrder(Order order);
    Order getOrder(Long id);
    Order updateOrderStatus(Long id, OrderStatus status);
    List<Order> getOrders();

}
