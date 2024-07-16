package org.example;

import java.util.HashMap;
import java.util.Map;

public class ClubeFactory {
    private static Map<String, Clube> clubes = new HashMap<>();

    public static Clube getClube(String nome) {
        Clube clube = clubes.get(nome);
        if (clube == null) {
            clube = new Clube(nome);
            clubes.put(nome, clube);
        }
        return clube;
    }

    public static int getTotalClubes() {
        return clubes.size();
    }

}