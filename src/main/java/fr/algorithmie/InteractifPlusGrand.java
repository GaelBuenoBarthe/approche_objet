package fr.alorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialiser à la plus petite valeur possible pour s'assurer que n'importe quel nombre sera plus grand
        int max = Integer.MIN_VALUE;

        // Demande 10 nombres à l'utilisateur
        for (int i = 1; i <= 10; i++) {
            System.out.print("Veuillez entrer le nombre " + i + " : ");
            int nombre = scanner.nextInt();
            if (nombre > max) {
                max = nombre; // Mettre à jour le plus grand nombre
            }
        }

        // Afficher le plus grand nombre
        System.out.println("Le plus grand des nombres saisis est : " + max);

        // Fermer le scanner
        scanner.close();
    }
}

