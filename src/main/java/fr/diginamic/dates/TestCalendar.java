package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

    public static void main(String[] args) {
        // Création de la date spécifiée : 19 mai 2016 à 23h59 et 30 secondes
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date date1 = calendar1.getTime();

        // Affichage de la date au format jour/mois/année
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date spécifiée: " + sdf1.format(date1));

        // Création de la date actuelle
        Calendar calendar2 = Calendar.getInstance();
        Date currentDate = calendar2.getTime();

        // Affichage de la date actuelle au format année/mois/jour heure:minute:seconde
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date actuelle: " + sdf2.format(currentDate));

        // Affichage de la date actuelle avec le nom des jours et des mois en français, russe, chinois et allemand
        printDateInDifferentLocales(currentDate, Locale.FRENCH);
        printDateInDifferentLocales(currentDate, new Locale("ru"));
        printDateInDifferentLocales(currentDate, Locale.CHINESE);
        printDateInDifferentLocales(currentDate, Locale.GERMAN);
    }

    private static void printDateInDifferentLocales(Date date, Locale locale) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", locale);
        System.out.println("Date actuelle en " + locale.getDisplayLanguage(locale) + ": " + sdf.format(date));
    }
}


