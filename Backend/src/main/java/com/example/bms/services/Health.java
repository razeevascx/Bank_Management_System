package com.example.bms.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Health {
    @GetMapping("/health")
    public String health() {
        return "Server is up and running";
    }

}
