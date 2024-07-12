package entites;

public class AdressePostale {

    private int numeroRue;
    private String libelleRue;
    private String codeostal;
    private String ville;

    public AdressePostale(int numeroRue, String libelleRue, String codeostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codeostal = codeostal;
        this.ville = ville;
    }

    public int getNumeroRue() {
        return this.numeroRue;
    }
    public String getLibelleRue() {
        return this.libelleRue;
    }
    public String getCodeostal() {
        return this.codeostal;
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
    public void setCodeostal(String codeostal) {
        this.codeostal = codeostal;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
}

