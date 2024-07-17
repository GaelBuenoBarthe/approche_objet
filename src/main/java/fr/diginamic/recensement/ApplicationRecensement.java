package fr.diginamic.recensement;

import fr.diginamic.recensement.entites.Recensement;

import java.util.Scanner;

public class ApplicationRecensement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recensement recensement = new Recensement();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Population d'une ville donnée");
            System.out.println("2. Population d'un département donné");
            System.out.println("3. Population d'une région donnée");
            System.out.println("4. Afficher les 10 régions les plus peuplées");
            System.out.println("5. Afficher les 10 départements les plus peuplés");
            System.out.println("6. Afficher les 10 villes les plus peuplées d'un département");
            System.out.println("7. Afficher les 10 villes les plus peuplées d'une région");
            System.out.println("8. Afficher les 10 villes les plus peuplées de France");
            System.out.println("9. Sortir");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    // Call the appropriate service class
                    break;
                case 2:
                    // Call the appropriate service class
                    break;
                case 3:
                    // Call the appropriate service class
                    break;
                case 4:
                    // Call the appropriate service class
                    break;
                case 5:
                    // Call the appropriate service class
                    break;
                case 6:
                    // Call the appropriate service class
                    break;
                case 7:
                    // Call the appropriate service class
                    break;
                case 8:
                    // Call the appropriate service class
                    break;
                case 9:
                    System.out.println("Sortie...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }
}
