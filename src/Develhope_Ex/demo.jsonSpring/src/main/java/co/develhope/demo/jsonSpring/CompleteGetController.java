package co.develhope.demo.jsonSpring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class CompleteGetController {

    @GetMapping(path = "/json/{regione}")
    public User json(
            @PathVariable String regione,
            @RequestParam(required = false, defaultValue = "NONE") String nome
    ) {
        return new User(nome, regione);
    }
}
