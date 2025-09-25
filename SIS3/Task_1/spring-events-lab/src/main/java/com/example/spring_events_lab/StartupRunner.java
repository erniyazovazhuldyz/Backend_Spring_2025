package com.example.spring_events_lab;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    private final CustomSpringEventPublisher publisher;

    public StartupRunner(CustomSpringEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void run(String... args) {
        System.out.println("🚀 Application started... publishing events");

        // Простое событие
        publisher.publishCustomEvent("Hello Spring Event!");

        // Транзакционное событие
        publisher.publishTransactionalEvent("Event in transaction");
    }
}
