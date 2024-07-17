package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

import java.util.Scanner;

public class PopulationDunDepartementDonne extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez saisir le code du département :");
        String codeDepartement = scanner.nextLine();
        int populationTotale = 0;
        for (Ville ville : recensement.getVilles()) {
            if (ville.getCodeDepartement().equals(codeDepartement)) {
                populationTotale += ville.getPopulationTotale();
            }
        }
        System.out.println("La population totale du département " + codeDepartement + " est de " + populationTotale + " habitants.");
    }
}
