package fr.diginamic.recensement.utils;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public static Recensement lireRecensement(String filePath) {
        List<Ville> villes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(CsvReader.class.getClassLoader().getResourceAsStream(filePath)))) {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue; // Skip the header line
                }
                String[] values = line.split(";");
                Ville ville = new Ville(
                        values[0], values[1], values[2], values[3], values[4], values[5], values[6],
                        Integer.parseInt(values[7].replace(" ", "")),
                        Integer.parseInt(values[8].replace(" ", "")),
                        Integer.parseInt(values[9].replace(" ", ""))
                );
                villes.add(ville);
            }
            System.out.println("Nombre de villes lues: " + villes.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Recensement(villes);
    }
}