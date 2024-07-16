package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Ville implements Comparable<Ville> {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }
    // Redéfinition de la méthode equals pour comparer les attributs nom et nbHabitants
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ville ville = (Ville) obj;
        return nbHabitants == ville.nbHabitants && nom.equals(ville.nom);
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    @Override
    public int compareTo(Ville autreVille) {
        return Integer.compare(this.nbHabitants, autreVille.nbHabitants);
    }

    @Override
    public String toString() {
        return nom + " avec " + nbHabitants + " habitants.";
    }
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        Collections.sort(villes);

        System.out.println("Villes triées par nom:");
        for (Ville ville : villes) {
            System.out.println(ville);
        }

        // Filtrage des villes ayant plus de 25000 habitants
        List<Ville> villesFiltrees = new ArrayList<>();
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > 25000) {
                villesFiltrees.add(ville);
            }
        }

        // Tri des villes filtrées en ordre décroissant de population
        villesFiltrees.sort(Comparator.comparingInt(Ville::getNbHabitants).reversed());

        // Affichage des villes triées
        System.out.println("Villes de plus de 25000 habitants triées par population décroissante:");
        for (Ville ville : villesFiltrees) {
            System.out.println(ville);
        }
    }
}
