import java.time.LocalTime;
import java.util.Scanner;

public class App {
    //private static Scanner sc = new Scanner(System.in);

    private static void stampaMenu() {
        System.out.println("**********************************");
        System.out.println("***********  MENU  ***************");
        System.out.println("**********************************");
        System.out.println("0) ESCI");
        System.out.println("1) INSERIMENTO NUOVA TRATTA");
        System.out.println("2) VISUALIZZA TRATTE");
        System.out.println("3) RIMUOVI TRATTA");
        System.out.println("**********************************");
        System.out.print("SCEGLI: ");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Tratta[] tratte = new Tratta[10];
        int contaTratte = 0;
        while(true) {
            stampaMenu();
            int scelta = sc.nextInt(); // ATTENTI PUO' ESSERE LANCIATA UNA ECCEZIONE
            sc.nextLine(); // PULISCO IL BUFFER
            if(scelta == 0) {
                // Esco
                System.out.println("Bye alla prossima");
                return;
            } else if(scelta == 1) {
                // Inserisco una tratta
                System.out.println("Inserisci la stazione di partenza");
                String stPar = sc.nextLine();
                System.out.println("Inserisci ora di partenza");
                String oraParStr = sc.nextLine();
                LocalTime oraPar = LocalTime.parse(oraParStr);

                System.out.println("Inserisci la stazione di arrivo");
                String stArr = sc.nextLine();
                System.out.println("Inserisci ora di arrivo");
                String oraArrStr = sc.nextLine();
                LocalTime oraArr = LocalTime.parse(oraArrStr);

                Tratta tr = new Tratta(stPar, oraPar, stArr, oraArr);
                tratte[contaTratte] = tr;
                contaTratte++;

            } else if(scelta == 2) {
                // Visualizzo le tratte inserite
                for(int i = 0; i < contaTratte; i++) {
                    if(tratte[i] != null) {
                        // PRIMA DI STAMPARE MI ACCERTO CHE SIA DIVERSO DA NULL
                        System.out.println(tratte[i].toString());
                    }
                }
            } else if(scelta == 3) {
                // Rimuovo la tratta

                // COME FARE?????
                System.out.println("Inserisci l'ID della tratta da rimuovere");
                int ID = sc.nextInt();
                sc.nextLine();

                for(int i = 0; i < contaTratte; i++) {
                    if(tratte[i] != null) {
                        // IMPORTANTE !! PRIMA DI ACCEDERE AD AL METODO 
                        // getID DEVO CONTROLLARE CHE L'OGGETTO ESISTA
                        if(tratte[i].getID() == ID)  {
                            // RImuovo la tratta
                            tratte[i] = null;
                        }
                    }
                }

            } 
            else {
                System.out.println("Opzione non disponibile");
            }
            sc.close();
        }
    }
}
