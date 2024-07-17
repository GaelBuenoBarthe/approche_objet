package fr.diginamic.recensement;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.services.*;
import fr.diginamic.recensement.utils.CsvReader;

import java.util.Scanner;

public class ApplicationRecensement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recensement recensement = CsvReader.lireRecensement("recensement.csv");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Population d'une ville donnée");
            System.out.println("2. Population d'un département donné");
            System.out.println("3. Population d'une région donnée");
            System.out.println("4. Afficher les 10 régions les plus peuplées");
            System.out.println("5. Afficher les 10 départements les plus peuplés");
            System.out.println("6. Afficher les 10 villes les plus peuplées d'un département");
            System.out.println("7. Afficher les 10 villes les plus peuplées d'une région");
            System.out.println("8. Afficher les 10 villes les plus peuplées de France");
            System.out.println("9. Sortir");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    PopulationDuneVilleDonnee recherchePopulationVille = new PopulationDuneVilleDonnee();
                    recherchePopulationVille.traiter(recensement, scanner);// Call the appropriate service class
                    break;
                case 2:
                    PopulationDunDepartementDonne recherchePopulationDepartement = new PopulationDunDepartementDonne();
                    recherchePopulationDepartement.traiter(recensement, scanner);// Call the appropriate service class
                    break;
                case 3:
                    PopulationDuneRegionDonnee recherchePopulationRegion = new PopulationDuneRegionDonnee();
                    recherchePopulationRegion.traiter(recensement, scanner);// Call the appropriate service class
                    break;
                case 4:
                    AfficherLes10RegionsLesPlusPeuplees rechercheRegionPlusPeuplees = new AfficherLes10RegionsLesPlusPeuplees();
                    rechercheRegionPlusPeuplees.traiter(recensement, scanner);// Call the appropriate service class
                    break;
                case 5:
                    AfficherLes10DepartementsLesPlusPeuples rechercheDepartementPlusPeuples = new AfficherLes10DepartementsLesPlusPeuples();
                    rechercheDepartementPlusPeuples.traiter(recensement, scanner);// Call the appropriate service class
                    break;
                case 6:
                    AfficherLes10VillesLesPlusPeupleesDunDepartement rechercheTop10VillesDepartement = new AfficherLes10VillesLesPlusPeupleesDunDepartement();
                    rechercheTop10VillesDepartement.traiter(recensement, scanner);// Call the appropriate service class
                    break;
                case 7:
                    AfficherLes10VillesLesPlusPeupleesDuneRegion rechercheTop10VillesRegion = new AfficherLes10VillesLesPlusPeupleesDuneRegion();
                    rechercheTop10VillesRegion.traiter(recensement, scanner);// Call the appropriate service class
                    break;
                case 8:
                    AfficherLes10VillesLesPlusPeupleesDeFrance rechercheTop10VillesFrance = new AfficherLes10VillesLesPlusPeupleesDeFrance();
                    rechercheTop10VillesFrance.traiter(recensement, scanner);// Call the appropriate service class
                    break;
                case 9:
                    System.out.println("Sortie...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }
}