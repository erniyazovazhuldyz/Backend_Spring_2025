package com.example.spring_events_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringEventsLabApplication implements CommandLineRunner {

    @Autowired
    private CustomSpringEventPublisher publisher;

    public static void main(String[] args) {
        SpringApplication.run(SpringEventsLabApplication.class, args);
    }

    @Override
    public void run(String... args) throws InterruptedException {
        // Публикуем события
        publisher.publish("Hello Spring Event!");
        publisher.publish("Another custom event");
        publisher.publishWithTransaction("Event in transaction");

        // Чтобы приложение не закрывалось сразу
        Thread.currentThread().join();
    }
}
