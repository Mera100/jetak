package life.majd.jetak.jetak;

import life.majd.jetak.jetak.domain.Address;
import life.majd.jetak.jetak.domain.Business;
import life.majd.jetak.jetak.domain.Role;
import life.majd.jetak.jetak.domain.User;
import life.majd.jetak.jetak.service.BusinessService;
import life.majd.jetak.jetak.service.OrderService;
import life.majd.jetak.jetak.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class JetakApplication {

    public static void main(String[] args) {
        SpringApplication.run(JetakApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService, OrderService orderService, BusinessService businessService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_OWNER"));
            userService.saveRole(new Role(null, "ROLE_COURIER"));
            userService.saveUser(new User(null, "Majd", "Hasan", "majdhasan", "1234", "majd.hasan@majd.com", new Address(null, "Mashhad Str", "Mashhad", "Hamerkaz", "16967", "Israel"), new ArrayList<>(), true));
            userService.saveUser(new User(null, "Mido", "Zoabi", "midoz82", "1234", "mido@mido.com", new Address(null, "Mashhad Str", "Mashhad", "Hamerkaz", "16967", "Israel"), new ArrayList<>(), true));
            businessService.saveBusiness(new Business(null, "Zaatar", new Address(null, "Mashhad Str", "Mashhad", "Hamerkaz", "16967", "Israel"), new ArrayList<>(), "0123456879"));
            businessService.saveBusiness(new Business(null, "Meshhdawi", new Address(null, "Mashhad Str", "Mashhad", "Hamerkaz", "16967", "Israel"), new ArrayList<>(), "0123456879"));
            businessService.addOwner("Zaatar", "midoz82");
            businessService.addOwner("Zaatar", "majdhasan");
            businessService.addOwner("Meshhdawi", "majdhasan");

            userService.addRoleToUser("majdhasan", "ROLE_ADMIN");

        };
    }
}
