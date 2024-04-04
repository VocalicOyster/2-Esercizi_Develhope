package Develhope_Ex.DesignPattern_1;

public class Cerchio implements Shape{

    private int numeroLati;

    public Cerchio(int numeroLati) {
        this.numeroLati = numeroLati;
    }

    @Override
    public void draw() {
        System.out.println("Sono un cerchio. Numero di lati: " + this.numeroLati);
    }
}
