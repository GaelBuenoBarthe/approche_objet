package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[]array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("Entiers supérieurs à 3 :");
        afficherEntiersSuperieursA3(array);

        System.out.println("\nEntiers pairs :");
        afficherEntiersPairs(array);

        System.out.println("\nValeurs aux index pairs :");
        afficherValeursIndexPairs(array);

        System.out.println("\nEntiers impairs :");
        afficherEntiersImpairs(array);
    }

    public static void afficherEntiersSuperieursA3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3) {
                System.out.println(array[i]);
            }
        }
    }

    public static void afficherEntiersPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void afficherValeursIndexPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void afficherEntiersImpairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
