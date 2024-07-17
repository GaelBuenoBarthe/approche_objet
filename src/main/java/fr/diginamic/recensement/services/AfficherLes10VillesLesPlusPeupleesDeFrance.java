package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AfficherLes10VillesLesPlusPeupleesDeFrance  extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Les 10 villes les plus peuplées de France sont :");
        List<Ville> villes = recensement.getVilles();
        villes.sort(Comparator.comparing(Ville::getPopulationTotale).reversed());
        for (int i = 0; i < 10; i++) {
            Ville ville = villes.get(i);
            System.out.println(ville.getNomCommune() + " : " + ville.getPopulationTotale() + " habitants");
        }
    }
}
