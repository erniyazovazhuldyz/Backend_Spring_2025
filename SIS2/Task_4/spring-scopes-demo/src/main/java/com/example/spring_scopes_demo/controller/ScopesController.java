package com.example.spring_scopes_demo.controller;

import com.example.spring_scopes_demo.model.HelloMessageGenerator;
import com.example.spring_scopes_demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/scopes")
public class ScopesController {

    // Singleton и Prototype Person
    @Autowired
    private Person personSingleton;

    @Autowired
    private Person personPrototype;

    // Request / Session / Application / Websocket HelloMessageGenerator
    @Resource(name = "requestScopedBean")
    private HelloMessageGenerator requestScopedBean;

    @Resource(name = "sessionScopedBean")
    private HelloMessageGenerator sessionScopedBean;

    @Resource(name = "applicationScopedBean")
    private HelloMessageGenerator applicationScopedBean;

    @Resource(name = "websocketScopedBean")
    private HelloMessageGenerator websocketScopedBean;

    // --- Singleton scope test ---
    @GetMapping("/singleton")
    public String testSingleton(@RequestParam String name) {
        personSingleton.setName(name);
        return "Singleton bean, name = " + personSingleton.getName();
    }

    // --- Prototype scope test ---
    @GetMapping("/prototype")
    public String testPrototype(@RequestParam String name) {
        personPrototype.setName(name);
        return "Prototype bean, name = " + personPrototype.getName();
    }

    // --- Request scope test ---
    @GetMapping("/request")
    public String testRequest() {
        String prev = requestScopedBean.getMessage();
        requestScopedBean.setMessage("Hello from request scope!");
        return "Previous: " + prev + ", Current: " + requestScopedBean.getMessage();
    }

    // --- Session scope test ---
    @GetMapping("/session")
    public String testSession() {
        String prev = sessionScopedBean.getMessage();
        sessionScopedBean.setMessage("Hello from session scope!");
        return "Previous: " + prev + ", Current: " + sessionScopedBean.getMessage();
    }

    // --- Application scope test ---
    @GetMapping("/application")
    public String testApplication() {
        String prev = applicationScopedBean.getMessage();
        applicationScopedBean.setMessage("Hello from application scope!");
        return "Previous: " + prev + ", Current: " + applicationScopedBean.getMessage();
    }

    // --- Websocket scope test (просто пример) ---
    @GetMapping("/websocket")
    public String testWebsocket() {
        String prev = websocketScopedBean.getMessage();
        websocketScopedBean.setMessage("Hello from websocket scope!");
        return "Previous: " + prev + ", Current: " + websocketScopedBean.getMessage();
    }
}
