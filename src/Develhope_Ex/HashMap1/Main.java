package Develhope_Ex.HashMap1;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> mappa1 = new HashMap<>();
        mappa1.put("giovanni", "innaimi");
        mappa1.put("claudia", "battista");
        System.out.println(mappa1);

        Map<String, String> mappa2 = Map.of("giovanni", "innaimi");
        System.out.println(mappa2);

        Map<String, String> mappa3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Giovanni", "innaimi"),
                new AbstractMap.SimpleEntry<>("giovanni", "battista")
        );
        System.out.println(mappa3);
    }
}
