public class SmartPhone {
    private String proprietario;
    private String modello;
    private String colore;

    /**
     * Costruttore
     * @param proprietario
     * @param modello
     * @param colore
     */
    public SmartPhone(String proprietario, String modello, String colore) {
        this.proprietario = proprietario;
        this.modello = modello;
        this.colore = colore;
      
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean equals(SmartPhone other) {
        if(this.proprietario.equals(other.proprietario) && 
            this.modello.equals(other.modello) &&
            this.colore.equals(other.colore) )
            return true;
        
        return false;
    }

    /**   
     * Ritorna la stringa descrittiva dell'oggetto
     */
    @Override
    public String toString() {
        return "SmartPhone [proprietario=" + proprietario + ", modello=" + modello + ", colore=" + colore + "]";
    }
   
    
}
