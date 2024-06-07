package com.example.demo4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Controller {

    @Value("${welcomeMsg}")
    private String msg;
    @GetMapping
    public String welcome() {
        return msg;
    }
}
