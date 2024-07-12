package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
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

        // Afficher le nombre s'il est compris entre 1 et 10
        System.out.println("Vous avez entré : " + nb);
        scanner.close();
    }
}

