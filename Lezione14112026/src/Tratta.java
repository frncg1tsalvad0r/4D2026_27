import java.time.LocalTime;

public class Tratta {
    private static int progressivo = 0;
    private int id;
    private String partenza;
    private LocalTime oraPartenza;
    private String arrivo;
    private LocalTime oraArrivo;

    public Tratta(String partenza, LocalTime oraPartenza, String arrivo, LocalTime oraArrivo) {
        this.id = progressivo;     
        progressivo++;  
        this.partenza = partenza;
        this.oraPartenza = oraPartenza;
        this.arrivo = arrivo;
        this.oraArrivo = oraArrivo;
    }

    public Tratta(Tratta other) {
        this.partenza = other.partenza;
        this.oraPartenza = other.oraPartenza;
        this.arrivo = other.arrivo;
        this.oraArrivo = other.oraArrivo;
    }

    public String toString() {
        return "Tratta{" +
                "id=" + id +
                ", partenza='" + partenza + '\'' +
                ", oraPartenza=" + oraPartenza +
                ", arrivo='" + arrivo + '\'' +
                ", oraArrivo=" + oraArrivo +
                '}';
    }
    
    public String getPartenza() {
        return partenza;
    }

    public void setPartenza(String partenza) {
        this.partenza = partenza;
    }

    public LocalTime getOraPartenza() {
        return oraPartenza;
    }

    public void setOraPartenza(LocalTime oraPartenza) {
        this.oraPartenza = oraPartenza;
    }

    public String getArrivo() {
        return arrivo;
    }

    public void setArrivo(String arrivo) {
        this.arrivo = arrivo;
    }

    public LocalTime getOraArrivo() {
        return oraArrivo;
    }

    public void setOraArrivo(LocalTime oraArrivo) {
        this.oraArrivo = oraArrivo;
    }

    public int getId() {
        return id;
    }

}
