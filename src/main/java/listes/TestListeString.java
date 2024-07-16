package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        // Creation ArrayList avec des villes
        List<String> villes = new ArrayList<>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        System.out.println("Liste des villes: " + villes);

        // Recherche de la ville avec le plus grand nombre de lettres
        String villePlusLongue = "";
        for (String ville : villes) {
            if (ville.length() > villePlusLongue.length()) {
                villePlusLongue = ville;
            }
        }
        System.out.println(" La ville avec le plus grand nombre de lettres est : " + villePlusLongue);

        // Modification du contenu de la liste pour mettre les noms en majuscules
        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }
        System.out.println("Liste avec noms en majuscules: " + villes);

        // Suppression des villes commençant par N
        villes.removeIf(ville -> ville.startsWith("N"));

        // Affichage de la liste résultante
        System.out.println("Liste après modifications: " + villes);
    }
}
