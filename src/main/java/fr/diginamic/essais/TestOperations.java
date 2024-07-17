package fr.diginamic.essais;

import fr.diginamic.operations.Operations;
import java.util.Scanner;

public class TestOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un premier nombre:");
        double a = scanner.nextDouble();
        System.out.println("Veuillez saisir un deuxième nombre:");
        double b = scanner.nextDouble();
        System.out.println("Veuillez saisir un opérateur (+, -, *, /):");
        char operateur = scanner.next().charAt(0);
        System.out.println("Résultat: " + Operations.calcul(a, b, operateur));
        scanner.close();
    }
}
