package fr.diginamic.chaines;

public class TString {
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();

        String s = "";
        for (int i = 1; i <= 100000; i++) {
            s += i;
        }

        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé avec String: " + (fin - debut) + " ms");
    }
}