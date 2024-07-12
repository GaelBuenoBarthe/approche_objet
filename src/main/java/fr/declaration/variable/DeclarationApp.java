package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 20;
        int myInt = 30;
        long myLong = 40L;
        float myFloat = 50.5f;
        double myDouble = 60.6;

        char myChar = 'A';
        boolean myBoolean = true;
        String myString = "Bonjour";

        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Char: " + myChar);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("String: " + myString);

        String randomString = "Voici le résultat d'un calcul:\n1+5=6";
        System.out.println(randomString);
    }
}
