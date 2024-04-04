package Develhope_Ex.DesignPattern_2;

public class Person {

    private String nome;
    private String cognome;
    private int eta;
    private String indirizzo;

    public Person(PersonBuilder builder) {
        this.nome = builder.nome;
        this.cognome = builder.cognome;
        this.eta = builder.eta;
        this.indirizzo = builder.indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }
}
