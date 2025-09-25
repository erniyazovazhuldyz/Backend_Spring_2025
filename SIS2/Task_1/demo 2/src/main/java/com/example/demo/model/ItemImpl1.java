package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component // теперь Spring сам создаст бин
public class ItemImpl1 implements Item {
    @Override
    public String getName() {
        return "ItemImpl1";
    }
}
