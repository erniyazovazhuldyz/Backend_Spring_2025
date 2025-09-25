package com.example.spring_events_lab;

import org.springframework.context.ApplicationEvent;

public class TransactionalSpringEvent extends ApplicationEvent {
    private final String message;

    public TransactionalSpringEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
