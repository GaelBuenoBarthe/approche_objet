package fr.diginamic.banque.entites;

abstract class Operation {
    private String date;
    private double montant;

    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    public abstract String afficherType();
    public abstract String getType();

    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }
}

