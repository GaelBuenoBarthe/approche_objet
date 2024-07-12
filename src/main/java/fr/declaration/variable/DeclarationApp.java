package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 206;
        int myInt = 35680;
        long myLong = 4000000000L;
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
