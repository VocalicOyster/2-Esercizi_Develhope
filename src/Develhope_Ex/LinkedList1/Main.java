package Develhope_Ex.LinkedList1;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Fruit> fruits = new LinkedList<>(Arrays.asList(new Fruit("Banana")));
        fruits.addFirst(new Fruit("Anguria"));

        System.out.println(fruits);
    }
}
