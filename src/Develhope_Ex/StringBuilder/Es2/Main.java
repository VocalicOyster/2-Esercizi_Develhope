package Develhope_Ex.StringBuilder.Es2;

public class Main {
    public static void main(String[] args) {
        System.out.println(charAt("Ciao, mi chiamo Giovannni", 11));

    }

    public static String charAt(String str, int index) {
        StringBuilder stringBuilder = new StringBuilder("Il carattere in quella posizione è: ");

        char[] charArr = str.toCharArray();

        if(index < 0 || index > charArr.length ) {
            return "ERRORE: INSERIRE INDICE VALIDO";
        }
        String str1 = "";

        for(int i=0; i<charArr.length; i++) {
            if(i == index) {
                str1 = stringBuilder.append(charArr[i-1]).toString();
            }
        }
        return str1;
    }
}
