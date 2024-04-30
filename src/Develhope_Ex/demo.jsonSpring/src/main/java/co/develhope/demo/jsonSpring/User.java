package co.develhope.demo.jsonSpring;

public class User {
    public User(String nome, String regione) {
        this.nome = nome;
        this.regione = regione;
        this.saluto = "Ciao " + nome + ", com'è il tempo in " + regione + "?";
    }

    public String nome;
    public String regione;
    public String saluto;
}

