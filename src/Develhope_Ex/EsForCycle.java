package Develhope_Ex;

public class EsForCycle {
    public static void main(String[] args) {
        invMaxNumb(10, 3);
    }

    public static void invMaxNumb(int numb, int max) {
        for(;max > 0; max--) {
            System.out.println(numb);
            numb--;
        }
    }
}
