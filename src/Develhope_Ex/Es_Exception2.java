package Develhope_Ex;

public class Es_Exception2 {
    public static void main(String[] args) throws Exception {
        System.out.println(controlChar('z'));

    }

    public static boolean controlChar(char character) throws Exception {
        if(character < 48 || character > 57) {
            throw new Exception("NON é UN NUMERO");
        }
        return true;
    }
}
