package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComptagePaysParContinent {
    public static class Pays {
        private String nom;
        private int nbHabitants;
        private String continent;

        public Pays(String nom, int nbHabitants, String continent) {
            this.nom = nom;
            this.nbHabitants = nbHabitants;
            this.continent = continent;
        }

        @Override
        public String toString() {
            return nom + " (" + nbHabitants + " d\'habitants) - " + continent;
        }

        public static void main(String[] args) {
            List<Pays> pays = new ArrayList<>();
            pays.add(new Pays("France", 65000000, "Europe"));
            pays.add(new Pays("Allemagne", 80000000, "Europe"));
            pays.add(new Pays("Belgique", 10000000, "Europe"));
            pays.add(new Pays("Russie", 150000000, "Asie"));
            pays.add(new Pays("Chine", 1400000000, "Asie"));
            pays.add(new Pays("Indonesie", 220000000, "Océanie"));
            pays.add(new Pays("Australie", 20000000, "Océanie"));


            Map<String, Integer> comptageParContinent = new HashMap<>();
            for (Pays p : pays) {
                comptageParContinent.put(p.continent, comptageParContinent.getOrDefault(p.continent, 0) + 1);
            }

            System.out.println("Liste des pays:");
            for (Pays p : pays) {
                System.out.println(p);
            }

            System.out.println("\nComptage des pays par continent:");
            comptageParContinent.forEach((continent, count) -> System.out.println(continent + ": " + count));
        }
    }
}
