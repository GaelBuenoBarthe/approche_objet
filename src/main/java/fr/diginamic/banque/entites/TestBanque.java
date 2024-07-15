package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        // Création d'un tableau de comptes
        Compte[] comptes = new Compte[2];

        // Création et ajout d'une instance de Compte au tableau
        comptes[0] = new Compte("39050386000", 805.50);

        // Création et ajout d'une instance de CompteTaux au tableau
        comptes[1] = new CompteTaux("48576094321", 1500.00, 2.5);

        // Boucle sur le tableau pour afficher les informations des comptes
        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
