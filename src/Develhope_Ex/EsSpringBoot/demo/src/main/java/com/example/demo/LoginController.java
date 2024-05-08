package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.Objects;

@Controller
public class LoginController {
    @PostMapping(path = "/login")
    public String login(LoginForm loginForm, Model model) {

        String username = loginForm.getUsername();
        String password = loginForm.getPassword();


        if(!Objects.equals(password, "admin") || !Objects.equals(username, "giovanni")) {
            model.addAttribute("errore", "Credenziali errate");
            return "index";
        }
        else {
            return "menuPrincipale";
        }
    }


}

