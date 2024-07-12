package fr.algorithmie;

public class SommeDeTableaux {

    public static void main(String[] args) {
        // Définir les deux tableaux array1 et array2
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        // Créer un tableau arrayMix pour stocker la somme des éléments correspondants
        int[] arrayMix = new int[array1.length];

        // Calculer la somme des éléments correspondants des deux tableaux
        for (int i = 0; i < array1.length; i++) {
            arrayMix[i] = array1[i] + array2[i];
        }

        // Afficher le tableau résultant arraySum
        System.out.println("Somme des éléments des deux tableaux :");
        for (int i = 0; i < arrayMix.length; i++) {
            System.out.print(arrayMix[i] + " ");
        }
        System.out.println();
    }
}

