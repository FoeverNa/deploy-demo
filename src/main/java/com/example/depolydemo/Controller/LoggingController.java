package com.example.depolydemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    @GetMapping("/")
    public String home() {
        return "8082로 바뀌어야되";
    }

    @GetMapping("/hello")
    public String wow() {
        return "real";
    }


}
