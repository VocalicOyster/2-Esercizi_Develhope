package Develhope_Ex.StringBuilder.Es1;

public class Main {
    public static void main(String[] args) {
        String str1 = "Ciao, mi chiamo Giovanni";
        String str2 = "Ciao, mi chiamo Giovanni";
        System.out.println(compareStr(str1, str2));

    }

    public static StringBuilder compareStr(String str1, String str2) {
        char[] strChar1 = str1.toCharArray();
        char[] strChar2 = str2.toCharArray();

        StringBuilder stringBuilder = new StringBuilder("Le stringhe sono ");

        for(int i=0; i<strChar1.length; i++) {
            if(strChar1[i] != strChar2[i]) {
                stringBuilder.append("diverse!");
                return stringBuilder;
            }
        }
        stringBuilder.append("uguali!");
        return stringBuilder;
    }
}
