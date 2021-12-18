package segurosxy.modelos.patrones;

public class PaisFlyWeight {
    private String Pais;

    public PaisFlyWeight(String pais) {
        Pais = pais;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        this.Pais = pais;
    }
}
