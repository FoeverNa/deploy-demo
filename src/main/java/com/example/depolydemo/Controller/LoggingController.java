package com.example.depolydemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    @GetMapping("/")
    public String home() {
        return "8081차례";
    }

    @GetMapping("/health")
    public String wow() {
        return "real";
    }


}
