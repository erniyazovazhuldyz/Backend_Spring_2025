package com.example.spring_events_lab;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class CustomSpringEventListener {

    @EventListener
    public void handleEvent(CustomSpringEvent event) {
        System.out.println("Received event: " + event.getMessage());
    }

    @Async
    @EventListener
    public void handleEventAsync(CustomSpringEvent event) {
        System.out.println("Handling asynchronously: " + event.getMessage() +
                " | Thread: " + Thread.currentThread().getName());
    }

    @Async
    @TransactionalEventListener
    public void handleEventAfterCommit(CustomSpringEvent event) {
        System.out.println("Handling AFTER-COMMIT event asynchronously: " + event.getMessage());
    }
}
