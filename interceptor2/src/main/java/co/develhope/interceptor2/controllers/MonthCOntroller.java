package co.develhope.interceptor2.controllers;

import co.develhope.interceptor2.entities.Month;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/month")
public class MonthCOntroller {

    @GetMapping
    public Month getMonth() {
        return  new Month(1, "January", "Gennaio", "Januar");
    }
}
