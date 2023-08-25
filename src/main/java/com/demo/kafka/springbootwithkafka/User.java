package com.demo.kafka.springbootwithkafka;

import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age=age;
    }
}
