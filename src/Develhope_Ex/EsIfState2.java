package Develhope_Ex;

public class EsIfState2 {
    public static void main(String[] args) {

        String text = "Ciao, Mondo bellissimo!";

        if(text.length() > 10) {
            System.out.println("Lunghezza maggiore di 10");
        }
        else if(text.length() < 10){
            System.out.println("Lunghezza minore di 10");
        }
        else {
            System.out.println("Lunghezza uguale a 10");
        }
    }
}
