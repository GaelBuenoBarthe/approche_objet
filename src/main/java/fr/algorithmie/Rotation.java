package fr.algorithmie;

public class Rotation {

    public static void main(String[] args) {
        // Déclarer un tableau d'entiers
        int[] array = {0, 1, 2, 3};

        // Si le tableau n'a pas d'éléments ou qu'il n'a qu'un seul élément, il n'y a pas de rotation à effectuer
        if (array.length <= 1) {
            System.out.println("Pas de rotation nécessaire");
            return;
        }

        // Effectuer la rotation à droite des éléments
        int lastElement = array[array.length - 1]; // Sauvegarder le dernier élément
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1]; // Déplacer chaque élément d'une position vers la droite
        }
        array[0] = lastElement; // Placer le dernier élément en première position

        // Afficher le tableau après la rotation
        System.out.println("Tableau après rotation à droite :");
        for (int arrayBis : array) {
            System.out.print(arrayBis + " ");
        }
        System.out.println();
    }
}

