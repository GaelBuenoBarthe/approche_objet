package fr.diginamic.recensement.entites;

import java.util.List;

public class Recensement {
    private List<Ville> villes;
    private List<Departement> Departements;
    private List<Region> Regions;

    public Recensement() {
        this.villes = villes;
        this.Departements = Departements;
        this.Regions = Regions;
    }

    public List<Ville> getVilles() {
        return villes;
    }

    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }

    public List<Departement> getDepartements() {
        return Departements;
    }

    public void setDepartements(List<Departement> departements) {
        Departements = departements;
    }

    public List<Region> getRegions() {
        return Regions;
    }

    public void setRegions(List<Region> regions) {
        Regions = regions;
    }
}