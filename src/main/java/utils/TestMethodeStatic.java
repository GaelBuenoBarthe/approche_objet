package utils;

public class TestMethodeStatic {

    public static void main(String[] args) {
        String chaine = "12";

        int nombre = Integer.parseInt(chaine);

        int a = 15;
        int b = 23;

        // Utilisez une méthode de la classe Integer qui calcule le nombre maximum entre a et b.
        int max = Integer.max(a, b);

        // Affichez le résultat de l’appel de cette méthode.
        System.out.println("Le nombre converti est : " + nombre);
        System.out.println("Le maximum entre " + a + " et " + b + " est : " + max);
    }
}
