package Develhope_Ex;

public class Es_Exception3 {
    public static void main(String[] args) throws Exception {
        divideByZero();

    }

    public static void divideByZero() throws Exception {
        try {
            int res = 20 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("DIVISIONE PER ZERO " + e.getMessage());
        }
    }
}
