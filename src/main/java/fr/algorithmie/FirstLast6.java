package fr.alorithmie;

public class FirstLast6 {

    public static void main(String[] args) {
        // Déclarer un tableau d'entiers
        int[] nums = {1, 2, 6};

        // Initialiser la variable booléenne result à false
        boolean result = false;

        // Si le tableau a au moins un élément et que le premier ou le dernier élément vaut 6, répondre true
        if (nums.length > 0 && (nums[0] == 6 || nums[nums.length - 1] == 6)) {
            result = true;
        }

        // Afficher le résultat
        System.out.println(result);
    }
}

