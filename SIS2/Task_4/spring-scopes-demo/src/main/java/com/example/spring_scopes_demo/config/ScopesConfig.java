package com.example.spring_scopes_demo.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.example.spring_scopes_demo.model.HelloMessageGenerator;

import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class ScopesConfig {

    // Singleton
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public HelloMessageGenerator singletonBean() {
        return new HelloMessageGenerator();
    }

    // Prototype
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public HelloMessageGenerator prototypeBean() {
        return new HelloMessageGenerator();
    }

    // Request
    @Bean
    @RequestScope
    public HelloMessageGenerator requestBean() {
        return new HelloMessageGenerator();
    }

    // Session
    @Bean
    @SessionScope
    public HelloMessageGenerator sessionBean() {
        return new HelloMessageGenerator();
    }

    // Application
    @Bean
    @ApplicationScope
    public HelloMessageGenerator applicationBean() {
        return new HelloMessageGenerator();
    }

    // WebSocket (только строка!)
    @Bean
    @Scope(value = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public HelloMessageGenerator websocketBean() {
        return new HelloMessageGenerator();
    }
}
