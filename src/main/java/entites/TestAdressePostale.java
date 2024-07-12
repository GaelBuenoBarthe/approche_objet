package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        //première adresse
        AdressePostale adressePostale1 = new AdressePostale(61,"boulevard carrière poissonnière", "34750", "Villeneuve-Lès-Maguelone");
        //première adresse
        AdressePostale adressePostale2 = new AdressePostale(420,"chemin de la mosson", "34750", "Villeneuve-Lès-Maguelone");

        affichageAdresse(adressePostale1);
        affichageAdresse(adressePostale2);
    }

    public static void affichageAdresse(AdressePostale adressePostale) {
        System.out.println("adresse : " + adressePostale.getNumeroRue() + " " + adressePostale.getLibelleRue() + " " + adressePostale.getCodeostal() + " " + adressePostale.getVille());
    }
}
