import java.time.LocalTime;

public class Tratta {
    private int ID;
    private String stazionePartenza;
    private LocalTime oraPartenza;
    private String stazioneArrivo;
    private LocalTime oraArrivo;
    static private int ultimoIDassegnato = 0;
    
    public Tratta(String stazionePartenza, LocalTime oraPartenza, String stazioneArrivo, LocalTime oraArrivo) {
        this.ID = Tratta.ultimoIDassegnato;
        Tratta.ultimoIDassegnato++;
        
        this.stazionePartenza = stazionePartenza;
        this.oraPartenza = oraPartenza;
        this.stazioneArrivo = stazioneArrivo;
        this.oraArrivo = oraArrivo;
    }
    
    @Override
    public String toString() {
        return "Tratta [ID=" + ID + ", stazionePartenza=" + stazionePartenza + ", oraPartenza=" + oraPartenza
                + ", stazioneArrivo=" + stazioneArrivo + ", oraArrivo=" + oraArrivo + "]";
    }

    public int getID() {
        return ID;
    }
    public void setStazionePartenza(String stazionePartenza) {
        this.stazionePartenza = stazionePartenza;
    }
    public void setOraPartenza(LocalTime oraPartenza) {
        this.oraPartenza = oraPartenza;
    }
    public void setStazioneArrivo(String stazioneArrivo) {
        this.stazioneArrivo = stazioneArrivo;
    }
    public void setOraArrivo(LocalTime oraArrivo) {
        this.oraArrivo = oraArrivo;
    }
    public String getStazionePartenza() {
        return stazionePartenza;
    }
    public LocalTime getOraPartenza() {
        return oraPartenza;
    }
    public String getStazioneArrivo() {
        return stazioneArrivo;
    }
    public LocalTime getOraArrivo() {
        return oraArrivo;
    }

    
}
