package com.mendes.project_spring.config;

import com.mendes.project_spring.entities.Order;
import com.mendes.project_spring.entities.User;
import com.mendes.project_spring.repositories.OrderRepository;
import com.mendes.project_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        User u3 = new User(null, "Samuel", "samuel@gmail.com", "7776666228", "123456");

        Order o1 = new Order(null, Instant.parse("2025-08-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2025-09-08T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2025-09-10T15:21:22Z"), u1);
        Order o4 = new Order(null, Instant.parse("2025-09-11T15:21:22Z"), u3);

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));

    }
}
