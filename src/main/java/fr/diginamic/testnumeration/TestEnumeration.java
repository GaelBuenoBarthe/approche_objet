package fr.diginamic.testnumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        // Affichage de toutes les saisons
        for (Saison saison : Saison.values()) {
            System.out.println(saison);
        }

        // Recherche par nom
        String nom = "ETE";
        Saison saisonNom = Saison.valueOf(nom);
        System.out.println("Libellé de " + nom + " : " + saisonNom.getLibelle());

        // Recherche par libellé
        String libelle = "Hiver";
        Saison saisonLibelle = Saison.getSaisonByLibelle(libelle);
        if (saisonLibelle != null) {
            System.out.println("Saison trouvée avec le libellé '" + libelle + "' : " + saisonLibelle.name());
        } else {
            System.out.println("Aucune saison trouvée avec le libellé '" + libelle + "'");
        }
    }
}