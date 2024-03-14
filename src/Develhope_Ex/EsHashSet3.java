package Develhope_Ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class EsHashSet3 {
    public static void main(String[] args) {

        HashSet firstHashSet = returnHashset();
        String num1 = "3";
        Iterator iterator = firstHashSet.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            if(element == num1) {
                iterator.remove();
            }
        }

        System.out.println(firstHashSet);
        firstHashSet.removeAll(firstHashSet);
        System.out.println(firstHashSet);



    }
    public static HashSet returnHashset() {
        return new HashSet<String>(Arrays.asList("1", "2", "3"));
    }
}
