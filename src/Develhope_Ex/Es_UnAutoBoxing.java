package Develhope_Ex;

public class Es_UnAutoBoxing {
    public static void main(String[] args) {
        int num1 = 2;
        Integer boxNum1 = num1;
        Integer num2 = 2;
        int unboxNum2 = num2;


        double num3 = 3;
        Double boxNum3 = num3;
        Double num4 = 3.0;
        double unboxNum4 = num4;


        char val = 'z';
        Character boxVal = val;
        Character val1 = 'a';
        char unboxVal = val1;


        sumInt(num1, unboxNum2);
        printChar(val);
        sumInteger(boxNum1, num2);
        printCharacter(boxVal);
    }

    public static void sumInt(int num1, int num2) {
        System.out.print("sum: ");
        System.out.println(num1 + num2);
    }

    public static void printChar(char character) {
        System.out.print("char: ");
        System.out.println(character);
    }

    public static void sumInteger(Integer num1, Integer num2) {
        System.out.print("sum Integer: ");
        System.out.println(num1 + num2);
    }

    public static void printCharacter(Character character) {
        System.out.print("Character: ");
        System.out.println(character);
    }
}
