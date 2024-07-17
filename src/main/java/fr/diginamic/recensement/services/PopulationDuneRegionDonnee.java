package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

import java.util.Scanner;

public class PopulationDuneRegionDonnee extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez saisir le nom de la région : ");
        String nomRegion = scanner.nextLine();

        int populationRegion = 0;
        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                populationRegion += ville.getPopulationTotale();
            }
        }

        System.out.println("La population de la région " + nomRegion + " est de " + populationRegion + " habitants.");
    }
}
