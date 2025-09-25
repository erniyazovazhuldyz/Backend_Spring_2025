package com.example.spring_events_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CustomSpringEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    // Обычная публикация события
    public void publish(String message) {
        System.out.println("Publishing custom event: " + message);
        CustomSpringEvent event = new CustomSpringEvent(this, message);
        applicationEventPublisher.publishEvent(event);
    }

    // Публикация события внутри транзакции
    @Transactional
    public void publishWithTransaction(String message) {
        System.out.println("Publishing transactional event: " + message);
        TransactionalSpringEvent event = new TransactionalSpringEvent(this, message);
        applicationEventPublisher.publishEvent(event);
    }

    // Этот метод раньше был "Unimplemented", поэтому и падало
    public void publishCustomEvent(String message) {
        publish(message);
    }

    public void publishTransactionalEvent(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'publishTransactionalEvent'");
    }
}
