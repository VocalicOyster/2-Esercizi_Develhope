package co.develhope.springDoc.services;

import org.springframework.stereotype.Service;

@Service
public class NameService {
    public String getNome(String nome) {

        return "Ciao " + nome;
    }

    public String reverseName(String nome) {
        StringBuilder stringBuilder = new StringBuilder(nome);
        return stringBuilder.reverse().toString();
    }
}
