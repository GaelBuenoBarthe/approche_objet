package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entites.Departement;
import fr.diginamic.recensement.entites.Recensement;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AfficherLes10DepartementsLesPlusPeuples extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Les 10 départements les plus peuplés sont :");
        List<Departement> departements = recensement.getDepartements();
        departements.sort(Comparator.comparing(Departement::getPopulationTotale).reversed());
        for (int i = 0; i < 10; i++) {
            Departement departement = departements.get(i);
            System.out.println(departement.getNomDepartement() + " : " + departement.getPopulationTotale() + " habitants");
        }
    }
}
