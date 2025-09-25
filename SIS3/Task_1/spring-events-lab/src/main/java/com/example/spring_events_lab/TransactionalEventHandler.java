package com.example.spring_events_lab;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class TransactionalEventHandler {

    @Transactional
    public void triggerTransactionalEvent(CustomSpringEventPublisher publisher) {
        publisher.publishTransactionalEvent("Event in transaction");
    }

    @TransactionalEventListener
    public void handleTransactionalEvent(String message) {
        System.out.println("Handling AFTER-COMMIT event asynchronously: " + message);
    }
}
