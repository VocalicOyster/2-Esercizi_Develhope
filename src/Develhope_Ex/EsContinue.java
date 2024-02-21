package Develhope_Ex;

public class EsContinue {
    public static void main(String[] args) {
        jumpAtContinue(10);
    }

    public static void jumpAtContinue(int val) {
        for(int i=0; i<=val; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
