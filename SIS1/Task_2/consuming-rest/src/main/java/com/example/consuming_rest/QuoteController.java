package com.example.consuming_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QuoteController {

    private final RestTemplate restTemplate;

    public QuoteController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/quote")
    public Quote getQuote() {
        return restTemplate.getForObject("http://localhost:8080/api/random", Quote.class);
    }
}
