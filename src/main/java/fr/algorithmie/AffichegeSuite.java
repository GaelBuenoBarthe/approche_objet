package fr.algorithmie;

public class AffichegeSuite {
    public static void main(String[] args) {
        // Boucle for pour afficher les nombres de 1 à 10 inclus
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Boucle for pour afficher les nombres pairs entre 0 et 10 inclus
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        // Boucle for pour afficher les nombres impairs entre 0 et 9 inclus
        for (int i = 1; i <= 9; i += 2) {
            System.out.println(i);
        }
        // Boucle while pour afficher les nombres entre 0 et 10 inclus
        int i =0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        // Boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
        i = 0;
        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }
        // Boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
        i = 1;
        while (i <= 9) {
            System.out.println(i);
            i += 2;
        }
    }
}
