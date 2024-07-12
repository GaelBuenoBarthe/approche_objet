package fr.tableaux;

public class ExerciceTableauChaines {

    public static void main(String[] args) {
        String[] tab = new String[5];
        tab[0] = "Montpellier";
        tab[1] = "Toulouse";
        tab[2] = "New York";
        tab[3] = "Punta Cana";
        tab[4] = "Paris";

        //Affichage des éléments du tableau
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
        System.out.println(tab[3]);
        System.out.println(tab[4]);

        //Affichage de la longueur du tableau
        System.out.println(tab.length);

        //Modififier l'élémént de l'index 3
        tab[3] = "Londres";

        //Affichage des éléments du tableau
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
        System.out.println(tab[3]);
        System.out.println(tab[4]);
    }
}
