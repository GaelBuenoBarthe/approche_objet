package fr.algorithmie;

public class ComparaisonTableau {

    public static void main(String[] args) {
        // Définir les deux tableaux array1 et array2
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        // Initialiser un compteur pour le nombre d'éléments communs
        int count = 0;

        // Comparer chaque élément de array1 avec chaque élément de array2
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                // Si un élément est présent dans les deux tableaux, incrémenter le compteur
                if (array1[i] == array2[j]) {
                    count++;
                    break; // Sortir de la boucle interne une fois qu'un élément commun est trouvé
                }
            }
        }

        // Afficher le nombre d'éléments communs
        System.out.println("Nombre d'éléments communs dans les deux tableaux : " + count);
    }
}

