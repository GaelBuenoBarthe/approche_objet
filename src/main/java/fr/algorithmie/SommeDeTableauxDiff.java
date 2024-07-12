package fr.alorithmie;

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
        if (array1.length > array2.length) {
            for (int i = array2.length; i < array1.length; i++) {
                arrayMix[i] = array1[i];
            }
        } else {
            for (int i = array1.length; i < array2.length; i++) {
                arrayMix[i] = array2[i];
            }
        }

        // Afficher le tableau résultant arrayMix
        System.out.println("Somme des éléments des deux tableaux :");
        for (int i = 0; i < arrayMix.length; i++) {
            System.out.print(arrayMix[i] + " ");
        }
        System.out.println();
    }
}

