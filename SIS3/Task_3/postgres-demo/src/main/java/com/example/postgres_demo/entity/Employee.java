package com.example.postgres_demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees") // таблица в Postgres
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String position;
    private String email; // новое поле

    public Employee() {}

    public Employee(String name, String position, String email) {
        this.name = name;
        this.position = position;
        this.email = email;
    }

    // getters & setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
