package life.majd.jetak.jetak.controller;

import life.majd.jetak.jetak.model.Business;
import life.majd.jetak.jetak.model.Order;
import life.majd.jetak.jetak.model.User;
import life.majd.jetak.jetak.service.BusinessService;
import life.majd.jetak.jetak.service.OrderService;
import life.majd.jetak.jetak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {


    private UserService userService;
    private OrderService orderService;
    private BusinessService businessService;

    @Autowired
    public HomeController(UserService userService, OrderService orderService, BusinessService businessService) {
        this.userService = userService;
        this.orderService = orderService;
        this.businessService = businessService;
    }

    @GetMapping("/")
    public String hello() {
        return "sit tight, jetak";
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getOrders() {
        return ResponseEntity.ok().body(orderService.getOrders());
    }

    @GetMapping("/businesses")
    public ResponseEntity<List<Business>> getBusinesses() {
        return ResponseEntity.ok().body(businessService.getBusinesses());
    }

}
