package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Region;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AfficherLes10RegionsLesPlusPeuplees extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Les 10 régions les plus peuplées de France sont :");
        List<Region> regions = recensement.getRegions();
        regions.sort(Comparator.comparing(Region::getPopulationTotale).reversed());
        for (int i = 0; i < 10; i++) {
            Region region = regions.get(i);
            System.out.println(region.getNomRegion() + " : " + region.getPopulationTotale() + " habitants");
        }
    }
}
