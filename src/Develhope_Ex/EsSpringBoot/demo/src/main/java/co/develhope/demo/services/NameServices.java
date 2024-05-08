package co.develhope.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class NameServices {

    public String getNome(String nome) {

        return "Ciao " + nome;
    }


    public String reverseName(String nome) {
        StringBuilder stringBuilder = new StringBuilder(nome);
        return stringBuilder.reverse().toString();
    }
}
