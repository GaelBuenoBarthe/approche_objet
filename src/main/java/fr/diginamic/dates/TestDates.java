package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        // Création d'une instance de Date à la date du jour
        Date dateDuJour = new Date();
        // Formatage de la date du jour sans la partie heure
        SimpleDateFormat formatJourMoisAnnee = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formatJourMoisAnnee.format(dateDuJour));

        // Création d'une instance de Date à la date du 19/05/2016 à 23:59:30
        // Les mois dans Date commencent à 0, donc mai est le 4ème mois
        Date dateSpecifique = new Date(116, 4, 19, 23, 59, 30);
        // Formatage de la date spécifique
        SimpleDateFormat formatAnneeMoisJourHeureMinuteSeconde = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatAnneeMoisJourHeureMinuteSeconde.format(dateSpecifique));

        // Création d'une instance de Date contenant la date/heure système
        Date dateHeureSysteme = new Date();
        // Affichage de la date/heure système au format spécifié
        System.out.println(formatAnneeMoisJourHeureMinuteSeconde.format(dateHeureSysteme));
    }
}
