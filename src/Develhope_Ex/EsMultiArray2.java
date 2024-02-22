package Develhope_Ex;

public class EsMultiArray2 {
    public static void main(String[] args) {
        changeMultiArr();
    }

    public static void changeMultiArr() {
        int[][] multiArr = {{1, 2, 3}, {4, 5, 6}};
        int [][] multiArr2 = new int[multiArr[0].length][multiArr.length];

        for(int i=0; i<multiArr.length; i++){
            for(int j=0; j<multiArr[i].length; j++){
                 multiArr2[j][i] = multiArr[i][j];
            }
        }
        for(int i=0; i<multiArr2.length; i++) {
            for(int j=0; j<multiArr2[i].length; j++) {
                System.out.print(multiArr2[i][j] + " ");
            }
            System.out.print('\n');
        }
    }
}
