package fr.algorithmie;

public class RechercheMax {

    public static void main(String[] args) {
        // Définir le tableau array
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Rechercher le plus grand élément du tableau
        int max = array[0]; // Initialiser max avec le premier élément du tableau
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Mettre à jour max si un élément plus grand est trouvé
            }
        }

        // Afficher le plus grand élément
        System.out.println("Le plus grand élément du tableau est : " + max);
    }
}

