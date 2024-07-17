package fr.diginamic.recensement.entites;

public class Ville {
    private String codeRegion;
    private String nomRegion;
    private String codeDepartement;
    private String codeArrondissement;
    private String codeCanton;
    private String codeCommune;
    private String nomCommune;
    private int populationMunicipale;
    private int populationCompteeAPart;
    private int populationTotale;

    public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeArrondissement, String codeCanton, String codeCommune, String nomCommune, int populationMunicipale, int populationCompteeAPart, int populationTotale) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.codeArrondissement = codeArrondissement;
        this.codeCanton = codeCanton;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.populationMunicipale = populationMunicipale;
        this.populationCompteeAPart = populationCompteeAPart;
        this.populationTotale = populationTotale;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

}
