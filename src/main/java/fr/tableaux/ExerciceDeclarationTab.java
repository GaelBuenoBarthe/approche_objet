package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] tab = new int[8];
        tab[0] = 8;
        tab[1] = -7;
        tab[2] = 12;
        tab[3] = 1;
        tab[4] = -2;
        tab[5] = 14;
        tab[6] = 17;
        tab[7] = 19;

        // Affichage de l'élément à l'index 0
        System.out.println("Element de index 0: " + tab[0]);

        //Affichage de la longuer du tableau
        System.out.println("Longueur du tableau: " + tab.length);

        //Affichage du dernier élément du tableau
        System.out.println("Dernier element du tableau: " + tab[tab.length - 1]);
    }
}
