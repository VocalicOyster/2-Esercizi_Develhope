package Develhope_Ex.Interfaces.Es_1;

public class Triangolo implements Forma{
    private int base = 10;
    private int altezza = 2;

    @Override
    public void calcolaArea() {
        System.out.println("L'area di un triangolo è: " + (base*altezza)/2);
    }
}
