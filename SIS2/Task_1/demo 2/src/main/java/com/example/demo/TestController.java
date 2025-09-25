package com.example.demo;

import com.example.demo.service.Store;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final Store store;

    public TestController(Store store) {
        this.store = store;
    }

    @GetMapping("/test")
    public String testDI() {
        return store.printItemName();
    }
}
