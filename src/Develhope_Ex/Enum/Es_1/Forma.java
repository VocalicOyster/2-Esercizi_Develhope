package Develhope_Ex.Enum.Es_1;

public abstract class Forma {
    enum tipoDiForma {
        Triangolo,
        Rettangolo
    }
    public abstract int calcolaArea(int base, int altezza);
}
