package Develhope_Ex.Enum.Es_1;

public class Rettangolo extends Forma{

    private tipoDiForma forma = tipoDiForma.Rettangolo;
    @Override
    public int calcolaArea(int base, int altezza) {
        return base*altezza;
    }
}
