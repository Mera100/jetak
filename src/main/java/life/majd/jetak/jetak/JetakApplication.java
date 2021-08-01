package life.majd.jetak.jetak;

import life.majd.jetak.jetak.model.Address;
import life.majd.jetak.jetak.model.Business;
import life.majd.jetak.jetak.model.User;
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

			userService.saveUser(new User(null,"Majd","Hasan","majdhasan","1234",new Address(null, "Mashhad Str", "Mashhad", "Hamerkaz", "16967", "Israel"),new ArrayList<>()));
			User mido = userService.saveUser(new User(null, "Mido", "Zoabi", "midoz82", "1234", new Address(null, "Mashhad Str", "Mashhad", "Hamerkaz", "16967", "Israel"), new ArrayList<>()));
			ArrayList<User> zaatarOwners = new ArrayList<>();
			businessService.saveBusiness(new Business(null,"Zaatar",new Address(null, "Mashhad Str", "Mashhad", "Hamerkaz", "16967", "Israel"),zaatarOwners,"0123456879"));
		};
	}

}
