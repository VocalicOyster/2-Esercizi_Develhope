package Es1;

public class Rettangolo extends Forma{

    int base = 10;
    int altezza = 5;

    public int calcolaArea(int a, int b) {
        return a * b;
    }

    @Override
    public int calcolaArea() {
        return 0;
    }
}
