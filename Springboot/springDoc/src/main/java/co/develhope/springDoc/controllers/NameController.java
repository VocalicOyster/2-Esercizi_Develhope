package co.develhope.springDoc.controllers;

import co.develhope.springDoc.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:5500")
public class NameController {

    @RestController
    public static class NameControllers {

        @Autowired
        NameService nameService;


        @GetMapping("/")
        public String ciao(@RequestParam String nome) {
            return nameService.getNome(nome);
        }
        @PostMapping("/ciao")
        public String reverseName(@RequestParam String nome) {
            return nameService.reverseName(nome);
        }
    }

}
