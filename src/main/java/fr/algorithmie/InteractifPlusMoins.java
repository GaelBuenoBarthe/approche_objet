package fr.alorithmie;

import java.util.Scanner;
import java.util.Random;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Choisir un nombre aléatoire entre 1 et 100
        int nombreAleatoire = 1 + random.nextInt(100);
        int essais = 0;
        int nombreUtilisateur = 0;

        System.out.println("Bienvenue dans le jeu du Plus ou Moins !");
        System.out.println("Essayez de deviner le nombre choisi entre 1 et 100.");

        // Boucle jusqu'à ce que l'utilisateur trouve le nombre
        while (nombreUtilisateur != nombreAleatoire) {
            System.out.print("Veuillez entrer votre nombre : ");
            nombreUtilisateur = scanner.nextInt();
            essais++;

            if (nombreUtilisateur < nombreAleatoire) {
                System.out.println("C'est plus !");
            } else if (nombreUtilisateur > nombreAleatoire) {
                System.out.println("C'est moins !");
            } else {
                System.out.println("Bravo, vous avez trouvé en " + essais + " coups !");
            }
        }

        // Fermer le scanner
        scanner.close();
    }
}

