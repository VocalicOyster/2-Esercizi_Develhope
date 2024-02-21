package Develhope_Ex;

public class EsCompOperator2 {
    public static void main(String[] args) {
        char firstChar = 'a';
        char secondChar = 'b';
        System.out.println(notEqual(firstChar, secondChar) + ", " + firstChar + " it's different from " + secondChar);
    }

    public static boolean notEqual(char firstChar, char SecondChar) {
        return firstChar != SecondChar;
    }
}
