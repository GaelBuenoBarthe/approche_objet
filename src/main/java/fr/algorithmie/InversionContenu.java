package fr.algorithmie;

public class InversionContenu {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //Affichage du tableau array
        System.out.println("Affichage du tableau array :");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //Creation d'un tableau arrayCopy en ordre inverse
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length - 1 - i];
        }
        //Affichage du tableau arrayCopy
        System.out.println("\nAffichage du tableau arrayCopy :");
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.println(arrayCopy[i]);
        }

    }
}
