package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Théâtre de la Ville",170);
        theatre.inscrire(20, 10.0);
        theatre.inscrire(30, 15.0);
        theatre.inscrire(130, 20.0);

        System.out.println("Nom : " + theatre.getNom());
        System.out.println("Capacité maximum : " + theatre.getCapaciteMax());
        System.out.println("Nombre d'inscrits : " + theatre.getNbInscrits());
        System.out.println("Recette totale : " + theatre.getRecette());
    }
}
