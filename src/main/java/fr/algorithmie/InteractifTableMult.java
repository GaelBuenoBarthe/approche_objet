package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = 0;

        // Tant que le nombre n'est pas compris entre 1 et 10, redemander un nombre à l'utilisateur
        while (nb < 1 || nb > 10) {
            System.out.print("Veuillez entrer un nombre entre 1 et 10 : ");
            nb = scanner.nextInt();

            if (nb < 1 || nb > 10) {
                System.out.println("Nombre incorrect. Veuillez réessayer.");
            }
        }

        // Afficher la table de multiplication du nombre
        System.out.println("Table de " + nb + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nb + " * " + i + " = " + (nb * i));
        }

        scanner.close();
    }
}

