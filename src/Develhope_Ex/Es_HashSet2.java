package Develhope_Ex;

import java.util.Arrays;
import java.util.HashSet;

public class Es_HashSet2 {
    public static void main(String[] args) {
        HashSet firstHashSet = returnHashset();
        String num1 = "3";
        if(firstHashSet.contains(num1)) {
            System.out.println("Element " + num1 + " is contained in the hashSet!");
        }
        else {
            System.out.println("Sorry, it is not in the HashSet!");
        }
    }

    public static HashSet returnHashset() {
        return new HashSet<String>(Arrays.asList("1", "2", "3"));
    }
}
