package Develhope_Ex;

public class EsArray1 {
    public static void main(String[] args) {
        fillArray();
    }

    public static void fillArray() {
        int res = 0;
        int[] arr;
        arr = new int[10];
        for(int i=0; i<10; i++) {
            arr[i] = i+1;
        }

        for(int i=0; i<arr.length; i++) {
            res += arr[i];
        }
        System.out.println(res);
    }
}
