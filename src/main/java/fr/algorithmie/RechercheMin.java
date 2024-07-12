package fr.algorithmie;

public class RechercheMin {

    public static void main(String[] args) {
        // Définir le tableau array
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Rechercher le plus petit élément du tableau
        int min = array[0]; // Initialiser min avec le premier élément du tableau
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Mettre à jour min si un élément plus petit est trouvé
            }
        }

        // Afficher le plus grand élément
        System.out.println("Le plus petit élément du tableau est : " + min);
    }
}