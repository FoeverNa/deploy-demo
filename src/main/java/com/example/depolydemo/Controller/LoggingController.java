package com.example.depolydemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    @GetMapping("/")
    public String home() {
        return "왜 헬스쳌통과를못해";
    }

    @GetMapping("/hello")
    public String wow() {
        return "real";
    }


}
