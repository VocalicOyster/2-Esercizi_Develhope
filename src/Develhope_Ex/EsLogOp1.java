package Develhope_Ex;

public class EsLogOp1 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 =  50;
        int compNumb = 23;

        System.out.println(logicComp(num1, num2, compNumb) + " primo: " + num1 + " secondo: " + num2 + " comp: " + compNumb);

    }

    public static boolean logicComp(int num1, int num2, int compVal) {

        boolean firstHigh = compVal >= num1 && compVal <= num2;
        boolean secondHigh = compVal >= num2 && compVal <= num1;

        return firstHigh || secondHigh;
    }
}
