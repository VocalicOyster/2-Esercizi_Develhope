package Develhope_Ex;

import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<String>(Arrays.asList("1", "2", "3", "4", "5"));
        Iterator<String> iterator = stringSet.iterator();



        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.print("Inserisci un numero: ");
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String req = scanner.nextLine();


        Iterator<String> iterator1 = stringSet.iterator();
        while (iterator1.hasNext()) {
            if(Objects.equals(iterator1.next(), req)) {
                iterator1.remove();
            }
        }

        System.out.println(stringSet);
        System.out.println();

        if(stringSet.isEmpty()) {
            System.out.println("é vuoto");
        }
        else System.out.println("Non è vuoto");
        System.out.println("Dimensione set: " + stringSet.size());
    }
}
