package com.example.demo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greet")
public class GreetingController {

    @Value("${authCode}")
    private String authCode;

    @Value("${devName}")
    private String devName;
    public String greeting() {
        return "Grande " + devName + "! AuthCode: " + authCode;
    }
}
