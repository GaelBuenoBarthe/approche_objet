package listes;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("New York", 8400000, Continent.AMERIQUE));
        villes.add(new Ville("Paris", 2200000, Continent.EUROPE));
        villes.add(new Ville("Pékin", 21540000, Continent.ASIE));
        villes.add(new Ville("Moscou", 12600000, Continent.EUROPE));
        villes.add(new Ville("Berlin", 3500000, Continent.EUROPE));
        villes.add(new Ville("Sydney", 5000000, Continent.OCEANIE));
        villes.add(new Ville("Sao Paulo", 12000000, Continent.AMERIQUE));
        villes.add(new Ville("Dakar", 3000000, Continent.AFRIQUE));

        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}