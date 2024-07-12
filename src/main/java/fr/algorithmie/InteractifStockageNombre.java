package fr.algorithmie;

import java.util.Scanner;
import java.util.Arrays;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taille initiale du tableau
        int[] nombres = new int[5];

        // Compteur pour le nombre d'éléments dans le tableau
        int count = 0;

        while (true) {
            // Affichage du menu
            System.out.println("Menu :");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            if (choix == 1) {
                // Ajouter un nombre
                System.out.print("Veuillez entrer un nombre : ");
                int nombre = scanner.nextInt();

                if (count == nombres.length) {
                    // Agrandir le tableau si nécessaire
                    nombres = Arrays.copyOf(nombres, nombres.length * 2);
                }

                nombres[count] = nombre;
                count++;
            } else if (choix == 2) {
                // Afficher les nombres existants
                if (count == 0) {
                    System.out.println("Aucun nombre n'a été ajouté.");
                } else {
                    System.out.println("Nombres existants :");
                    for (int i = 0; i < count; i++) {
                        System.out.print(nombres[i] + " ");
                    }
                    System.out.println();
                }
            } else if (choix == 3) {
                // Quitter le programme
                System.out.println("Au revoir !");
                break;
            } else {
                System.out.println("Option invalide. Veuillez choisir une option valide.");
            }
        }

        // Fermer le scanner
        scanner.close();
    }
}

