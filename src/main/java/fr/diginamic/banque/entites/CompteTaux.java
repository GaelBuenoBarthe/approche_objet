package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private double taux;


    public CompteTaux(String numero, double solde, double taux) {
        super(numero, solde);
        this.taux = taux;
    }

    // toString pour afficher les détails du compte
    @Override
    public String toString() {
        return super.toString() + "\ntaux = " + taux +"%.";
    }
}
