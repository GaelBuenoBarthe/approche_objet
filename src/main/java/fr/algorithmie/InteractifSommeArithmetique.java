package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande un nombre à l'utilisateur
        System.out.print("Veuillez entrer un nombre : ");
        int nombre = scanner.nextInt();

        // Calcul de la somme de tous les entiers compris entre 1 et le nombre saisi
        int somme = 0;
        for (int i = 1; i <= nombre; i++) {
            somme += i;
        }

        // Affichage de la somme
        System.out.println("La somme de tous les entiers compris entre 1 et " + nombre + " est : " + somme);

        // Fermer le scanner
        scanner.close();
    }
}
