package Develhope_Ex;

public class Es_Null1 {
    public static void main(String[] args) {
        controlNull(null, null);
    }

    public static void controlNull(Integer num, Integer den) {
        try {
            if(num > 0) {
                System.out.println("SI");
            }
        }
        catch (NullPointerException e) {
            System.out.println("Valore numeratore nullo!");
        }

        try {
            if(den > 0) {
                System.out.println("SI");
            }
        }
        catch (NullPointerException e) {
            System.out.println("Valore denominatore nullo!");
            System.out.println(e.getMessage());
        }
    }
}
