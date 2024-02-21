package Develhope_Ex;

public class EsLogOp2 {
    public static void main(String[] args) {
        int number = 13;
        System.out.println(number + " pari: " + oddOrEven(number));
    }

    public static boolean oddOrEven(int num1) {
       int res =  num1 % 2;
       return res == 0;
    }
}
