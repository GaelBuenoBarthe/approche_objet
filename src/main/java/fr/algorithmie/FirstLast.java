package fr.algorithmie;

public class FirstLast {

    public static void main(String[] args) {
        // Déclarer un tableau d'entiers
        int[] nums = {1, 2, 3, 1};

        // Si le 1er et dernier éléments du tableaux sont égaux et que le tableau fait au moins 1 retourne true
        boolean result = nums.length >= 1 && nums[0] == nums[nums.length - 1];

        // Afficher le résultat
        System.out.println(result);
    }
}
