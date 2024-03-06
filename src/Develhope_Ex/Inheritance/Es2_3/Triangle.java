package Develhope_Ex.Inheritance.Es2_3;

public class Triangle extends Forma {
    int base = 10;
    int altezza  = 3;

    @Override
    public void calcolaArea() {
        System.out.println("La mia area misura; " + (this.base * this.altezza)/2 + " ;)");
    }
}
