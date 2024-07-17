package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

import java.util.Scanner;

public class TestCercle {

    public static void main(String[] args) {
        Cercle cercle1 = new Cercle(5.0);
        Cercle cercle2 = new Cercle(10.0);

        System.out.println("Cercle 1:");
        System.out.println("Périmètre: " + cercle1.perimetre());
        System.out.println("Surface: " + cercle1.surface());

        System.out.println("Cercle 2:");
        System.out.println("Périmètre: " + cercle2.perimetre());
        System.out.println("Surface: " + cercle2.surface());
    }
}

