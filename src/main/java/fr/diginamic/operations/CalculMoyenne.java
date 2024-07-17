package fr.diginamic.operations;

public class CalculMoyenne {
    private static double[] tab;

    public CalculMoyenne() {
        tab = new double[0];
    }

    public void ajout(double d) {
        double[] newTab = new double[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            newTab[i] = tab[i];
        }
        newTab[tab.length] = d;
        tab = newTab;
    }

    public static double calcul() {
        double sum = 0;
        for (double d : tab) {
            sum += d;
        }
        return sum / tab.length;
    }
}
