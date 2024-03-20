package Develhope_Ex.HashMap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> mappa2 = Map.of(3, "Innaimi", 1, "Giovanni", 2, "Claudia", 0, "Palermo");
        List<String> listaValori = new ArrayList<>(mappa2.values());

        Collections.sort(listaValori);

        for(String valore: listaValori) {
            System.out.println(valore);
        }


    }
}
