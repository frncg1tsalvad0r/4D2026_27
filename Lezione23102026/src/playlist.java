// ==================== CLASSE PLAYLIST (Ex Classe Cerchio/Triangolo) ====================
class Playlist {
    private Brano branoInEvidenza; // Tipo composto (Oggetto)
    private int limiteBrani;       // Campo Intero
    private String nomePlaylist;   // Campo Stringa

    // Attributo statico per il conteggio globale
    private static int conteggioPlaylist = 0;

    // Costruttore Standard
    public Playlist(Brano branoInEvidenza, int limiteBrani, String nomePlaylist) {
        // Deep copy del brano per evitare modifiche esterne accidentali
        this.branoInEvidenza = new Brano(branoInEvidenza);
        this.limiteBrani = limiteBrani;
        this.nomePlaylist = nomePlaylist;
        conteggioPlaylist++; // Incremento contatore statico
    }

    // Costruttore di Copia (Deep Copy)
    public Playlist(Playlist altra) {
        this.branoInEvidenza = new Brano(altra.branoInEvidenza); // Copia profonda dell'oggetto
        this.limiteBrani = altra.limiteBrani;
        this.nomePlaylist = altra.nomePlaylist;
        conteggioPlaylist++; // Incremento contatore statico
    }

    // Equivalente a calcolaArea()
    public double calcolaMinutiTotaliStimati() {
        return (branoInEvidenza.getDurataInSecondi() * limiteBrani) / 60.0;
    }

    // Equivalente a calcolaCirconferenza()
    public int calcolaSecondiTotaliStimati() {
        return branoInEvidenza.getDurataInSecondi() * limiteBrani;
    }

    // Metodo statico
    public static int getConteggioPlaylist() {
        return conteggioPlaylist;
    }

    @Override
    public String toString() {
        return "Playlist: " + nomePlaylist + " [Capacità Max: " + limiteBrani + 
               " brani, In Evidenza: " + branoInEvidenza + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Playlist p = (Playlist) obj;
        return limiteBrani == p.limiteBrani &&
               nomePlaylist.equalsIgnoreCase(p.nomePlaylist) &&
               branoInEvidenza.equals(p.branoInEvidenza);
    }
}