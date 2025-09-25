package com.example.demo.model;

public class Transmission {
    private String mode;

    public Transmission(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return mode;
    }
}
