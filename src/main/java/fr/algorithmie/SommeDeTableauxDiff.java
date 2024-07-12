package fr.algorithmie;

public class SommeDeTableauxDiff {

    public static void main(String[] args) {
        // Définir les deux tableaux array1 et array2
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        // Créer un tableau arrayMix pour stocker la somme des éléments correspondants
        int length = Math.max(array1.length, array2.length); // Longueur maximale des deux tableaux
        int[] arrayMix = new int[length];

        // Calculer la somme des éléments correspondants jusqu'à la longueur du tableau le plus court
        for (int i = 0; i < Math.min(array1.length, array2.length); i++) {
            arrayMix[i] = array1[i] + array2[i];
        }

        // Ajouter les éléments restants du tableau le plus long au tableau résultant
        System.arraycopy(array1, array2.length, arrayMix, array2.length, array1.length - array2.length);

        // Afficher le tableau résultant arrayMix
        System.out.println("Somme des éléments des deux tableaux :");
        for (int mix : arrayMix) {
            System.out.print(mix + " ");
        }
        System.out.println();
    }
}

