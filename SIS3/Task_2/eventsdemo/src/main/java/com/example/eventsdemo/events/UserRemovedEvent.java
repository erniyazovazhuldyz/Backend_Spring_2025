package com.example.eventsdemo.events;

public class UserRemovedEvent {
    private final String name;

    public UserRemovedEvent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
