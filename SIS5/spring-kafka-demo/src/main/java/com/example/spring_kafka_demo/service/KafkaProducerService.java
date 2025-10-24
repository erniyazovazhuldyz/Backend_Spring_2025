package com.example.spring_kafka_demo.service;

import com.example.spring_kafka_demo.model.Farewell;
import com.example.spring_kafka_demo.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    private String topic = "multitype";

    public void sendGreeting(String msg, String name) {
        kafkaTemplate.send(topic, new Greeting(msg, name));
    }

    public void sendFarewell(String msg, int remainingMinutes) {
        kafkaTemplate.send(topic, new Farewell(msg, remainingMinutes));
    }

    public void sendStringMessage(String msg) {
        kafkaTemplate.send(topic, msg);
    }
}
