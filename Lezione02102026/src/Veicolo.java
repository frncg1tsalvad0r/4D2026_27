public class Veicolo {
    private String marca;
    private String modello;
    private String targa;
    private String tipoAlimentazione;
    private double potenza;
    private int numeroPosti;

    Veicolo(String mar, String mod, String tar, String ta, double po, int np) {
        this.marca = mar;
        this.modello = mod;
        this.targa = tar;
        this.tipoAlimentazione = ta;
        this.potenza = po;
        this.numeroPosti = np;
    }

    /**
     * SETTER
     * @param potenza
     */
    public void setPotenza(double potenza) {
        if(potenza <= 0 || potenza >= 3000) {
            return;
        }
        this.potenza = potenza;
    }

    /**
     * GETTER
     * @return la potenza
     */
    public  double getPotenza() {
        return this.potenza;
    }

    public String getMarca() {
        return marca;
    }

    
    public String getModello() {
        return modello;
    }

    public String getTarga() {
        return targa;
    }

    public String getTipoAlimentazione() {
        return tipoAlimentazione;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    
}
