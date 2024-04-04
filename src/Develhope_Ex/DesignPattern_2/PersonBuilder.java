package Develhope_Ex.DesignPattern_2;

public class PersonBuilder {

     String nome;
     String cognome;
     int eta;
     String indirizzo;
    public PersonBuilder(){}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public PersonBuilder setEta(int eta) {
        this.eta = eta;
        return this;
    }
    public PersonBuilder setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
        return this;
    }

    public Person build() {
        return new Person(this);
    }


}
