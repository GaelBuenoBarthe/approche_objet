package fr.diginamic.banque.entites;



public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = {
                new Credit("2023-07-13", 1000.0),
                new Debit("2023-07-14", 500.0),
                new Credit("2023-07-15", 280.0),
                new Debit("2023-07-15", 360.0)
        };

        double montantGlobal = 0.0;

        for (Operation operation : operations) {
            System.out.println("Date: " + operation.getDate() + ", Montant: " + operation.getMontant() + ", Type: " + operation.getType());

            if ("CREDIT".equals(operation.getType())) {
                montantGlobal += operation.getMontant();
            } else if ("DEBIT".equals(operation.getType())) {
                montantGlobal -= operation.getMontant();
            }
        }

        System.out.println("Montant global: " + montantGlobal);
    }
}
