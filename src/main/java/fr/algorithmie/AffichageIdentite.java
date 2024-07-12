package fr.algorithmie;

public class AffichageIdentite {

    public static void main(String[] args) {
        String nom = "Bueno-Barthe";
        String prenom = "Gaël";
        String nomComplet = nom + " " + prenom;
      //Affichege du nom complet 10 fois
        for (int i = 0; i < 10; i++) {
            System.out.println(nomComplet);
        }
    }
}
