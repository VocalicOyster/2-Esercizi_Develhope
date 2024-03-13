package Develhope_Ex;

public class Es_exception4 {
    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3};
        tryException(arrInt);
    }

    public static void tryException(int[] arr) {
        try {
            int res = arr[3]/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Division " + e.getMessage());
        }
        catch (IndexOutOfBoundsException i) {
            System.out.println(i.getMessage());
        }
        finally {
            System.out.println("FINE DELLA FUNZIONE");
        }
    }
}
