package fr.diginamic.recensement.entites;

import java.util.List;

public class Recensement {
    private List<Ville> villes;
    private List<Departement> departements;
    private List<Region> regions;

    public Recensement(List<Ville> villes) {
        this.villes = villes;
    }

    public List<Ville> getVilles() {
        return villes;
    }

    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }

    public List<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(List<Departement> departements) {
        this.departements = departements;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
}