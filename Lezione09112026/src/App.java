
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        LocalDate giorno = LocalDate.of(2026, 12, 20);
        LocalTime ora = LocalTime.of(10, 15);
        LocalDateTime appuntamento = LocalDateTime.of(giorno, ora);
        System.out.println("Appuntamento: " + appuntamento);
        System.out.println("Giorno: " + giorno.getDayOfMonth());
        System.out.println("Mese: " + giorno.getMonthValue());
        System.out.println("Anno: " + giorno.getYear());
        LocalDate giornoPrecedente = giorno.minusDays(1);
        LocalTime oraFine = ora.plusMinutes(30);
        System.out.println("Controllo dopo 1 giorno: " + giornoPrecedente);
        System.out.println("inizio appuntamento: " + oraFine);
        LocalDate oggi = LocalDate.now();
        boolean bisestile = giorno.isLeapYear();
        if (giorno.isAfter(oggi)) {
            System.out.println("L'appuntamento deve ancora arrivare.");
        } else if (giorno.isBefore(oggi)) {
            System.out.println("L'appuntamento e' gia' passato.");
        } else {
            System.out.println("L'appuntamento e' oggi.");
        }
        if (bisestile) {
            System.out.println("L'anno e' bisestile");
        } else {
            System.out.println("L'anno non e' bisestile");
        }
    }
}/// Domanda:Il metodo plusDays(7) non modifica direttamente la variabile giorno
 /// perché gli oggetti della classe LocalDate in Java sono immutabili.
