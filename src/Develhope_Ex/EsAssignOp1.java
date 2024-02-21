package Develhope_Ex;

public class EsAssignOp1 {
    public static void main(String[] args) {
        System.out.println(incrAndMult(12, 4));
    }

    public static int incrAndMult(int num1, int num2) {
        num1 += 3;
        num2 += 3;
        return num1 * num2;
    }
}
