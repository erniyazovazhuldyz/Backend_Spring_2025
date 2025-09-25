package com.example.eventsdemo.publisher;

import com.example.eventsdemo.events.UserCreatedEvent;
import com.example.eventsdemo.events.UserRemovedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Publisher {

    private final ApplicationEventPublisher publisher;

    public Publisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishUserEvents(String name) {
        System.out.println(">>> Publishing events for user: " + name);

        // событие через ApplicationEvent
        publisher.publishEvent(new UserCreatedEvent(this, name));

        // событие как обычный объект
        publisher.publishEvent(new UserRemovedEvent(name));
    }
}
