package Develhope_Ex;

public class Es_Casting_2 {
    public static void main(String[] args) {
        char firstChar = 'f';
        char secondChar = 'g';

        //Casting esplicito
        int sum = (int)firstChar + (int)secondChar;
        System.out.println(sum);

        //Casting implicito
        sum = firstChar + secondChar;
        System.out.println(sum);
    }
}