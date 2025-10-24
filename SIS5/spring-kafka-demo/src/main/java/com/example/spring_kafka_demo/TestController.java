package com.example.spring_kafka_demo;

import com.example.spring_kafka_demo.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private KafkaProducerService producerService;

    @GetMapping("/sendGreeting")
    public String sendGreeting(@RequestParam String msg, @RequestParam String name) {
        producerService.sendGreeting(msg, name);
        return "Greeting sent!";
    }

    @GetMapping("/sendFarewell")
    public String sendFarewell(@RequestParam String msg, @RequestParam int minutes) {
        producerService.sendFarewell(msg, minutes);
        return "Farewell sent!";
    }

    @GetMapping("/sendString")
    public String sendString(@RequestParam String msg) {
        producerService.sendStringMessage(msg);
        return "String sent!";
    }
}
