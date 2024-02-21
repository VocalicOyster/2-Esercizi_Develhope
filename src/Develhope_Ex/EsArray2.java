package Develhope_Ex;

public class EsArray2 {
    public static void main(String[] args) {
        fillArr();
    }

    public static void fillArr() {
        char[] arr = {'a', 'd', 'g', 'a', 'f', 's', 'a', 'q'};

        for(int i=0; i< arr.length; i++) {
            if (arr[i] == 'a') {
                System.out.println(arr[i]);
            }
            else {
                System.out.println(0);
            }
        }

    }
}
