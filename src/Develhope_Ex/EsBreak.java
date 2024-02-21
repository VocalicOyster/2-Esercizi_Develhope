package Develhope_Ex;

public class EsBreak {
    public static void main(String[] args) {
        stopAtBreak(4);
    }

    public static void stopAtBreak(int val) {
        for(int i=0; i<=val; i++) {
            System.out.println(i);
            if(i == 5) {
                break;
            }
        }
    }
}
