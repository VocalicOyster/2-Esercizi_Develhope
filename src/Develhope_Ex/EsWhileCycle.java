package Develhope_Ex;

public class EsWhileCycle {
    public static void main(String[] args) {
        int numb = 5;
        int res = 0;

        while (numb >= 1) {
            numb--;
            res = res + numb;
        }
        System.out.println(res);
    }
}
