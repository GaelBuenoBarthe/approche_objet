package fr.diginamic.banque.entites;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        // Création d'un compte avec un solde
        Compte compte = new Compte("123456789", 1000.50);

        System.out.println(compte);
    }
}
