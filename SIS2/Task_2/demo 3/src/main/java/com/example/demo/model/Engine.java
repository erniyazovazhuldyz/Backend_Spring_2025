package com.example.demo.model;

public class Engine {
    private String type;
    private int power;

    public Engine(String type, int power) {
        this.type = type;
        this.power = power;
    }

    @Override
    public String toString() {
        return type + " (" + power + "L)";
    }
}
