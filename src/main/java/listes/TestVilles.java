package listes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestVilles {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000,Continent.EUROPE ));
        villes.add(new Ville("Carcassonne", 47800,Continent.EUROPE ));
        villes.add(new Ville("Narbonne", 53400,Continent.EUROPE ));
        villes.add(new Ville("Lyon", 484000,Continent.EUROPE ));
        villes.add(new Ville("Foix", 9700,Continent.EUROPE ));
        villes.add(new Ville("Pau", 77200, Continent.EUROPE));
        villes.add(new Ville("Marseille", 850700,Continent.EUROPE ));
        villes.add(new Ville("Tarbes", 40600,Continent.EUROPE ));

        System.out.println("Liste des villes:" + villes);

        // Recherche de la ville la plus peuplée
        Ville villePlusPeuplee = villes.stream().max(Comparator.comparingInt(Ville::getNbHabitants)).orElse(null);
        System.out.println("La ville la plus peuplée est : " + villePlusPeuplee + ".");

        // Suppression de la ville la moins peuplée
        Ville villeMoinsPeuplee = villes.stream().min(Comparator.comparingInt(Ville::getNbHabitants)).orElse(null);
        villes.remove(villeMoinsPeuplee);

        // Modification des villes de plus de 100 000 habitants
        villes.forEach(ville -> {
            if (ville.getNbHabitants() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        });

        // Affichage de la liste résultante
        System.out.println("Liste des villes après modifications:");
        villes.forEach(System.out::println);
    }
}