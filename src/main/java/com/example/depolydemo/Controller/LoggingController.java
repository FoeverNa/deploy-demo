package com.example.depolydemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    @GetMapping("/wow")
    public String wow() {
        return "wow";
    }

    @GetMapping("/help")
    public String help() {
        return "help";
    }
}
