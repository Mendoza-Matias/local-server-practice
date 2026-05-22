package com.mmendoza.localserver.controller;

import com.mmendoza.localserver.domain.Greeting;
import com.mmendoza.localserver.domain.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class StatusController {

    @GetMapping("/health")
    public Health health() {
        return new Health("UP", Instant.now());
    }

    @GetMapping("/hello")
    public Greeting hello() {
        return new Greeting("Hola desde Spring Boot!", "1.0.0");
    }
}
