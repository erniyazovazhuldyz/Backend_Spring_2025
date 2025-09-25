package com.example.spring_events_lab;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncEventListener {

    @EventListener
    public void handleEvent(String message) {
        System.out.println("Received event: " + message);
    }

    @Async
    @EventListener
    public void handleAsyncEvent(String message) {
        System.out.println("Handling asynchronously: " + message + " | Thread: " + Thread.currentThread().getName());
    }
}
