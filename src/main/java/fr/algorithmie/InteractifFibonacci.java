package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de choisir un rang N
        System.out.print("Veuillez entrer un rang N pour la suite de Fibonacci : ");
        int N = scanner.nextInt();

        // Calculer le nombre de Fibonacci de rang N
        int fibonacciNumber = calculateFibonacci(N);

        // Afficher le nombre de rang N
        System.out.println("Le nombre de Fibonacci de rang " + N + " est : " + fibonacciNumber);

        // Fermer le scanner
        scanner.close();
    }

    // Méthode pour calculer le nombre de Fibonacci de rang N
    public static int calculateFibonacci(int N) {
        if (N <= 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int fib = 0;

        for (int i = 2; i <= N; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }
}

