package Develhope_Ex.Abstract.Es1;

public class Triangolo extends Forma{
    int base = 10;
    int altezza = 3;
    @Override
    public void calcolaArea() {
        System.out.println("Area triangolo: " + (this.base * this.altezza)/2);
    }
}
