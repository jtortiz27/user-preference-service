package com.ortiz.user.preference;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableRabbit
@EnableWebFlux
public class UserPreferenceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserPreferenceServiceApplication.class, args);
    }

}
