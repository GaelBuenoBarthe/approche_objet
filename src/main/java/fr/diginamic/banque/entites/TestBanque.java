package fr.diginamic.banque.entites;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        // Création d'un compte avec un solde
        Compte compte = new Compte("39050386000", 805.50);

        System.out.println(compte);
    }
}
