package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;
    private final Transmission transmission;

    // Constructor-based injection
    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car with " + engine + " engine and " + transmission + " transmission.";
    }
}
