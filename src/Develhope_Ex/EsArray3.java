package Develhope_Ex;

import java.lang.reflect.Array;

public class EsArray3 {
    public static void main(String[] args) {
        int[] numbArr = {12, 4, 1, 5, 90, 12, 7, 4, 4, 2, 1};
        int[] newArr = duplicNums(numbArr);

        for(int i=0; i<newArr.length; i++) {
            System.out.println(newArr[i] + ", ");
        }
    }

    public static int[] duplicNums(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                if(i == j){
                    continue;
                }
                if(arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }
        return arr;
    }
}
