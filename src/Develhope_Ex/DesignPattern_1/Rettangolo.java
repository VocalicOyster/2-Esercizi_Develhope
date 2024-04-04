package Develhope_Ex.DesignPattern_1;

public class Rettangolo implements Shape{

    private int numeroLati;

    public Rettangolo(int numeroLati) {
        this.numeroLati = numeroLati;
    }

    public void draw() {
        System.out.println("Sono un rettangolo. Numero di lati: " + this.numeroLati);
    }
}
