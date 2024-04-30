package co.develhope.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {

    @GetMapping(path = "/ciao")
    public String ciao(@RequestParam String nome, @RequestParam String regione) {
        return "Ciao " + nome + ". Com'è il tempo in  " + regione + "?";
    }
}
