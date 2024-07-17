package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int capaciteMax;
    private int nbInscrits;
    private double recette;

    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.nbInscrits = 0;
        this.recette = 0.0;
    }

    public void inscrire(int nbClients, double prix) {
        if (nbClients + nbInscrits > capaciteMax) {
            System.out.println("Il n'y a plus assez de place disponible pour inscrire " + nbClients + " clients.");
        } else {
            nbInscrits += nbClients;
            recette += nbClients * prix;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public int getNbInscrits() {
        return nbInscrits;
    }

    public void setNbInscrits(int nbInscrits) {
        this.nbInscrits = nbInscrits;
    }

    public double getRecette() {
        return recette;
    }

    public void setRecette(double recette) {
        this.recette = recette;
    }
}
