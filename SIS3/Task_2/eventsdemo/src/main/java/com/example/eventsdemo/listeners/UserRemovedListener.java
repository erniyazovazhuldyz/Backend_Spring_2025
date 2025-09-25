package com.example.eventsdemo.listeners;

import com.example.eventsdemo.events.UserRemovedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserRemovedListener {

    @EventListener
    public void handleUserRemoved(UserRemovedEvent event) {
        System.out.println(">>> UserRemovedListener получил событие: " + event.getName());
    }
}
