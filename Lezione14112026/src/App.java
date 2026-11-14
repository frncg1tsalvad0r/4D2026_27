import java.time.LocalTime;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void stampaMenu() {
        System.out.println("******************************************");
        System.out.println("***               MENU                 ***");
        System.out.println("******************************************");
        System.out.println("0) TERMINA");
        System.out.println("1) INSERSCI TRATTA");
        System.out.println("2) VISUALIZZA TRATTE");
        System.out.println("******************************************");
    }

    public static void main(String[] args) {
        int opzione = 0;
        while(true) {
            
            stampaMenu();
            opzione = sc.nextInt();
            if(opzione == 0) {
                // Termina
                System.out.println("Bye programma terminato");
                break;
            } else if (opzione == 1) {
                // Inserisci tratta
                System.out.println("Inserisci la stazione di partenza");
                String stazionePartenza = sc.nextLine();
                System.out.println("Inserisci l'ora di partenza");
                String oraPartenzaFormatoStringa = sc.nextLine();
                LocalTime oraPartenza = LocalTime.parse(oraPartenzaFormatoStringa);

                System.out.println("Inserisci la stazione di arrivo");
                String stazioneArrivo = sc.nextLine();
                System.out.println("Inserisci l'ora di arrivo");
                String oraArrivoFormatoStringa = sc.nextLine();
                LocalTime oraArrivo = LocalTime.parse(oraArrivoFormatoStringa);

            } else if (opzione == 2) {
                // Visualizza tratte
            }
        }
    }
}
