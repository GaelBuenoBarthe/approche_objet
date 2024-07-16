package listes;

public class TestEquals {
    public static void main(String[] args) {
        Ville ville1 = new Ville("Paris", 2000000,Continent.EUROPE );
        Ville ville2 = new Ville("Paris", 2000000,Continent.EUROPE );
        Ville ville3 = new Ville("Lyon", 1500000,Continent.EUROPE );

        // Test avec equals
        System.out.println("Avec equals:");
        System.out.println("ville1 et ville2 ont le même nombre d\'habitants: " + ville1.equals(ville2));
        System.out.println("ville1 et ville3 ont le même nombre d\'habitants: " + ville1.equals(ville3));

        // Test avec ==
        System.out.println("\nAvec ==:");
        System.out.println("ville1 et ville2 sont les mêmes objets: " + (ville1 == ville2));
        System.out.println("ville1 et ville3 sont les mêmes objets: " + (ville1 == ville3));

        // Pour que la comparaison avec == retourne true, il faut que les deux variables pointent vers le même objet en mémoire.
        Ville ville4 = ville1;
        System.out.println("\nComparaison de ville1 et ville4 avec == après assignation de ville4 à ville1:");
        System.out.println("ville1 et ville4 sont les mêmes objets: " + (ville1 == ville4));
    }
}