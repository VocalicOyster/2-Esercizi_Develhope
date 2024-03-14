package Develhope_Ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Es_Hashset1 {
    public static void main(String[] args) {
        HashSet firstSet = returnHashset();
        System.out.println("firt HashSet: " + firstSet);
        System.out.println("his length: " + firstSet.size());
    }

    public static HashSet returnHashset() {
        return new HashSet<String>(Arrays.asList("1", "2", "3"));
    }
}
