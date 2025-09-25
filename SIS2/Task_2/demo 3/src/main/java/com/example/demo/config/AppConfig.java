package com.example.demo.config;

import com.example.demo.model.Engine;
import com.example.demo.model.Transmission;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class AppConfig {

    @Bean
    public Engine engine() {
        return new Engine("V8", 5);
    }

    @Bean
    public Transmission transmission() {
        return new Transmission("automatic");
    }
}
