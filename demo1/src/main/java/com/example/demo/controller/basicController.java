package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class basicController {

    @Value("${devName}")
    private String devName;
    public String basic() {
        return devName;
    }
}
