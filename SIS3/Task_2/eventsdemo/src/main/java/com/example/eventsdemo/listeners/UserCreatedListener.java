package com.example.eventsdemo.listeners;

import com.example.eventsdemo.events.UserCreatedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedListener implements ApplicationListener<UserCreatedEvent> {

    @Override
    public void onApplicationEvent(UserCreatedEvent event) {
        System.out.println(">>> UserCreatedListener получил событие: " + event.getName());
    }
}
