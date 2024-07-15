package fr.diginamic.banque.entites;

public class CompteTaux {

    private String numero;
    private double solde;
    private double taux;

    public CompteTaux(String numero, double solde, double taux) {
        this.numero = numero;
        this.solde = solde;
        this.taux = taux;
    }
}
