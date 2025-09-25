package com.example.autowire;

import com.example.autowire.service.FooService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final FooService fooService;

    public TestController(FooService fooService) {
        this.fooService = fooService;
    }

    @GetMapping("/format")
    public String format() {
        return fooService.getFormatted();
    }
}
