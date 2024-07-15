package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        //Personne1
        Personne personne1 = new Personne("Bueno-Barthe", "Gaël", new AdressePostale(61,"boulevard carrière poissonnière", "34750", "Villeneuve-Lés-Maguelone"));
        //Personne2
        Personne personne2 = new Personne("Barthe-Bueno", "Nathan", new AdressePostale(420,"chemin de la mosson", "34750", "Villeneuve-Lés-Maguelone"));

        affichagePersonne(personne1);
        affichagePersonne(personne2);
    }
    public static void affichagePersonne(Personne personne){
        System.out.println(personne.getNom() + " " + personne.getPrenom() + ", " + personne.getAdressePostale().getNumeroRue() + " " + personne.getAdressePostale().getLibelleRue() + ", " + personne.getAdressePostale().getCodepostal() + ", " + personne.getAdressePostale().getVille() + ".");

    }

}
