public class Lampada {

    private int potenzaMassima;
    private int flussoLuminosoMassimo;

    private int rosso;
    private int verde;
    private int blu;
    private boolean accesa;


    /**
     * Costruttore senza parametri
     * Inizializza l'oggetto con valori predefiniti
     */
    public Lampada() {
        this.potenzaMassima = 4;
        this.flussoLuminosoMassimo = 250;
        this.rosso = 50;
        this.verde = 50;
        this.blu = 50;
        this.accesa = false;
    }

    /**
     * Costruttore 
     * Inizializza solo potenzaMassima e flussoLuminosoMassimo
     */
    public Lampada(int potenzaMassima, int flussoLuminosoMassimo) {
        this.potenzaMassima = 4;
        this.flussoLuminosoMassimo = 250;
        this.rosso = 50;
        this.verde = 50;
        this.blu = 50;
        this.accesa = false;
    }

    /**
     * Setters
     */
    public void setPotenzaMassima(int potenzaMassima) {
        if(potenzaMassima >= 0 && potenzaMassima <50)
            this.potenzaMassima = potenzaMassima;
    }

    public void setFlussoLuminosoMassimo(int flussoLuminosoMassimo) {
        if(flussoLuminosoMassimo >= 0 && flussoLuminosoMassimo <5.500)
            this.flussoLuminosoMassimo = flussoLuminosoMassimo;
    }

    public void setRosso(int rosso) {
        if(rosso >= 0 && rosso <= 100)
            this.rosso = rosso;
    }

    public void setVerde(int verde) {
        if(verde >= 0 && verde <= 100)
            this.verde = verde;
    }

    public void setBlu(int blu) {
        if(blu >= 0 && blu <= 100)
            this.blu = blu;
    }

    public void accendi() {
        this.accesa = true;
    }

    public void spegni() {
        this.accesa = false;
    }

    /**
     * Getters
     */
    public int getPotenzaMassima() {
        return potenzaMassima;
    }

    public int getFlussoLuminosoMassimo() {
        return flussoLuminosoMassimo;
    }

    public int getRosso() {
        return rosso;
    }

    public int getVerde() {
        return verde;
    }

    public int getBlu() {
        return blu;
    }

    public boolean isAccesa() {
        return accesa;
    }

    /**    (non-Javadoc)
     * Ritorna la stringa descrittiva dell'oggettto
     * @see java.lang.Object#toString()
     */
    public String toString() {
        String s = "";
        s += "Max Pot " + this.potenzaMassima +
            "Max Flux " + this.flussoLuminosoMassimo +
            "Rosso" + this.rosso +
            "Verde " + this.verde +
            "Blu " + this.blu +
            "Accesa " + this.accesa;
        return s;
     }

}
