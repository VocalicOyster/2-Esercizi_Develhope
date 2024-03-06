package Develhope_Ex.Interfaces.Es_1;

public class Rettangolo implements Forma{

    private int base = 10;
    private int altezza = 2;

    @Override
    public void calcolaArea() {
        System.out.println("L'area di un rettangolo è: " + base*altezza);
    }
    }

