package fr.alorithmie;

import java.util.Scanner;
import java.util.Random;

public class Interactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Nombre initial de bâtons
        int batons = 21;

        System.out.println("Bienvenue au jeu des 21 bâtons !");
        System.out.println("Le but du jeu est d'éviter de prendre le dernier bâton.");
        System.out.println("Vous pouvez prendre 1, 2 ou 3 bâtons à chaque tour.");

        // Pour alterner les tours entre le joueur et l'ordinateur
        boolean joueurTour = true;

        while (batons > 0) {
            System.out.println("\nIl reste " + batons + " bâtons.");

            if (joueurTour) {
                // Tour du joueur
                int joueurPrend = 0;
                while (joueurPrend < 1 || joueurPrend > 3 || joueurPrend > batons) {
                    System.out.print("Combien de bâtons prenez-vous (1, 2 ou 3) ? ");
                    joueurPrend = scanner.nextInt();
                    if (joueurPrend < 1 || joueurPrend > 3 || joueurPrend > batons) {
                        System.out.println("Nombre invalide. Vous devez prendre entre 1 et 3 bâtons, et pas plus que le nombre de bâtons restants.");
                    }
                }

                batons -= joueurPrend;
                // Passer le tour à l'ordinateur
                joueurTour = false;
                if (batons == 0) {
                    System.out.println("Vous avez pris le dernier bâton. Vous avez perdu !");
                }
            } else {
                // Tour de l'ordinateur
                int ordinateurPrend = Math.min(random.nextInt(3) + 1, batons);
                System.out.println("L'ordinateur prend " + ordinateurPrend + " bâton(s).");
                batons -= ordinateurPrend;
                // Passer le tour au joueur
                joueurTour = true;
                if (batons == 0) {
                    System.out.println("L'ordinateur a pris le dernier bâton. Vous avez gagné !");
                }
            }
        }

        // Fermer le scanner
        scanner.close();
    }
}

