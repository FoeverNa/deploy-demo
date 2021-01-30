package com.example.depolydemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    @GetMapping("/")
    public String home() {
        return "8082로떠야되222";
    }

    @GetMapping("/hello")
    public String wow() {
        return "real";
    }


}
