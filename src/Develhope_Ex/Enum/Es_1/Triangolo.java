package Develhope_Ex.Enum.Es_1;

public class Triangolo extends Forma{

    private tipoDiForma forma = tipoDiForma.Triangolo;
    @Override
    public int calcolaArea(int base, int altezza) {
        return (base*altezza)/2;
    }
}
