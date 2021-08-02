package life.majd.jetak.jetak.controller;

import life.majd.jetak.jetak.domain.Business;
import life.majd.jetak.jetak.domain.Order;
import life.majd.jetak.jetak.domain.User;
import life.majd.jetak.jetak.service.BusinessService;
import life.majd.jetak.jetak.service.OrderService;
import life.majd.jetak.jetak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/user")
    public ResponseEntity<User> addUser(User user) {
        return ResponseEntity.ok().body(userService.saveUser(user));
    }

    @PostMapping("/users")
    public ResponseEntity<List<User>> addUsers(List<User> users) {
        return ResponseEntity.ok().body(userService.saveUsers(users));
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }


    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getOrders() {
        return ResponseEntity.ok().body(orderService.getOrders());
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable String id) {
        return ResponseEntity.ok().body(orderService.getOrder(Long.valueOf(id)));
    }

    @GetMapping("/business/{name}")
    public ResponseEntity<Business> getBusiness(@PathVariable String name) {
        return ResponseEntity.ok().body(businessService.getBusiness(name));
    }

    @GetMapping("/userBusiness/{name}")
    public ResponseEntity<List<Business>> getBusinessesByOwner(@PathVariable String name) {
        return ResponseEntity.ok().body(businessService.getBusinessesByOwner(name));
    }

    @GetMapping("/businesses")
    public ResponseEntity<List<Business>> getBusinesses() {
        return ResponseEntity.ok().body(businessService.getBusinesses());
    }

}
