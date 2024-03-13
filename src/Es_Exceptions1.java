public class Es_Exceptions1 {
    public static void main(String[] args) throws Exception {
        int numb = 10;
        System.out.println(controlRange(5));
        System.out.println("SI");
    }

    public static boolean controlRange(int numb) throws Exception {
        if (numb < 10 || numb > 20) {
            throw new Exception("Numero inserito non è nel range 10-20");
        }

        return true;
    }
}
