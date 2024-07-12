package entites;

public class AdressePostale {

    private int numeroRue;
    private String libelleRue;
    private String codepostal;
    private String ville;

    public AdressePostale(int numeroRue, String libelleRue, String codepostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codepostal = codepostal;
        this.ville = ville;
    }

    public int getNumeroRue() {
        return this.numeroRue;
    }
    public String getLibelleRue() {
        return this.libelleRue;
    }
    public String getCodepostal() {
        return this.codepostal;
    }
    public String getVille() {
        return this.ville;
    }

    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }
    public void setLibelleRue(String libelleRue) {
        this.libelleRue = libelleRue;
    }
    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
}

