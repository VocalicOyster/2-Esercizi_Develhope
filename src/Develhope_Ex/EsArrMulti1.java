package Develhope_Ex;

public class EsArrMulti1 {
    public static void main(String[] args) {
        multiArr();
    }

    public static void multiArr() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int res = 0;

        for(int i=0; i<1; i++) {
            for(int j=0; j<arr[i].length; j++) {
                res += arr[i][j];
            }
        }
        System.out.println(res);
    }
}
