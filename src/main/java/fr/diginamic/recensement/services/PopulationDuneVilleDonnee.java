package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

import java.util.Scanner;

public class PopulationDuneVilleDonnee extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez saisir le nom de la ville dont vous souhaitez connaitre la population : ");
        String nomVille = scanner.nextLine();
        boolean villeTrouvee = false;
        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomCommune().equalsIgnoreCase(nomVille)) {
                System.out.println("La population de la ville de " + nomVille + " est de " + ville.getPopulationTotale() + " habitants.");
                villeTrouvee = true;
                break;
            }
        }
        if (!villeTrouvee) {
            System.out.println("La ville de " + nomVille + " n'a pas été trouvée.");
        }
    }
}
