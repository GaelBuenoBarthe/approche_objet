package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionList {
    public static void main(String args[]) {
        List<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        List<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        System.out.println(liste1);
        System.out.println(liste2);

        // Fusion des listes liste1 et liste2 en utilisant des boucles
        List<String> liste3 = new ArrayList<>();

        for (String element : liste1) {
            liste3.add(element);
        }

        for (String element : liste2) {
            liste3.add(element);
        }

        // Affichage de la liste fusionnée
        System.out.println(liste3);
    }
}
