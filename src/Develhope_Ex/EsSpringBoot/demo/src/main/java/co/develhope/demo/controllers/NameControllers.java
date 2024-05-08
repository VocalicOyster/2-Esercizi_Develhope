package co.develhope.demo.controllers;

import co.develhope.demo.services.NameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NameControllers {

    @Autowired
    NameServices nameServices;

     @GetMapping("/")
    public String name(@RequestParam String nome) {
        return nameServices.getNome(nome);
     }

     @PostMapping("/ciao")
    public String reverseName(@RequestParam String nome) {
         return nameServices.reverseName(nome);
     }
}
