package listes;

public enum Continent {
    AFRIQUE("Afrique"),
    EUROPE("Europe"),
    ASIE("Asie"),
    AMERIQUE("Amérique"),
    OCEANIE("Océanie");

    private final String libelle;

    Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
