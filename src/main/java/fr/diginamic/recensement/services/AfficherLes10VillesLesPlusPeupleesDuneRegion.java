package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AfficherLes10VillesLesPlusPeupleesDuneRegion extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez saisir le nom d'une région :");
        String nomRegion = scanner.nextLine();

        List<Ville> villesDeLaRegion = recensement.getVilles().stream()
                .filter(ville -> ville.getNomRegion().equals(ville.getNomRegion()))
                .sorted(Comparator.comparing(Ville::getPopulationTotale).reversed())
                .collect(Collectors.toList());

        System.out.println("Les 10 villes les plus peuplées de la région " +  nomRegion + " sont :");
        for (int i = 0; i < Math.min(10, villesDeLaRegion.size()); i++) {
            Ville ville = villesDeLaRegion.get(i);
            System.out.println(ville.getNomCommune() + " : " + ville.getPopulationTotale() + " habitants");
        }
    }
}
