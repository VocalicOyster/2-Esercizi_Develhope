package Develhope_Ex.Abstract.Es1;

public class Rettangolo extends Forma{

    int base = 10;
    int altezza = 5;
    @Override
    public void calcolaArea() {
        System.out.println("Area rettangolo: " + this.base * this.altezza);

    }
}
