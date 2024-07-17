package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AfficherLes10VillesLesPlusPeupleesDunDepartement extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez saisir le code du département :");
        String codeDepartement = scanner.nextLine();

        List<Ville> villesDuDepartement = recensement.getVilles().stream()
                .filter(ville -> ville.getCodeDepartement().equals(codeDepartement))
                .sorted(Comparator.comparing(Ville::getPopulationTotale).reversed())
                .collect(Collectors.toList());

        System.out.println("Les 10 villes les plus peuplées du département " + codeDepartement + " sont :");
        for (int i = 0; i < Math.min(10, villesDuDepartement.size()); i++) {
            Ville ville = villesDuDepartement.get(i);
            System.out.println(ville.getNomCommune() + " : " + ville.getPopulationTotale() + " habitants");
        }
    }
}
