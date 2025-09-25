package com.example.demo.service;

import com.example.demo.model.Item;
import org.springframework.stereotype.Service;

@Service
public class Store {
    private final Item item;

    // внедрение через конструктор
    public Store(Item item) {
        this.item = item;
    }

    public String printItemName() {
        return "Store has: " + item.getName();
    }
}
