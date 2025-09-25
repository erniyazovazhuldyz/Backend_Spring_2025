package com.example.eventsdemo;

import com.example.eventsdemo.publisher.Publisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EventsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventsdemoApplication.class, args);
    }

    // Демонстрация публикации событий
    @Bean
    public CommandLineRunner demo(Publisher publisher) {
        return args -> {
            publisher.publishUserEvents("Zhuldyz");
            publisher.publishUserEvents("Reflectoring");
        };
    }
}
