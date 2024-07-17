package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;
import java.util.Scanner;

public class TestMoyenne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculMoyenne calculMoyenne = new CalculMoyenne();

        System.out.println("Veuillez saisir un nombre (ou 'q' pour quitter) :");
        while (scanner.hasNextDouble()) {
            double nombre = scanner.nextDouble();
            calculMoyenne.ajout(nombre);
            System.out.println("Veuillez saisir un autre nombre (ou 'q' pour quitter) :");
        }

        System.out.println("Moyenne : " + calculMoyenne.calcul());
        scanner.close();
    }
}