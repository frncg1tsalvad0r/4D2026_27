



// ==================== CLASSE DI TEST (MAIN) ====================
public class App {
    public static void main(String[] args) {
        // 1. Istanziazione dei brani musicali
        Brano b1 = new Brano("Starboy", 230);
        Brano b2 = new Brano("Blinding Lights", 200);

        // 2. Creazione delle playlist (Standard e Copia)
        Playlist pl1 = new Playlist(b1, 20, "Pop Hits 2026");
        Playlist pl2 = new Playlist(b2, 15, "Gym Workout");
        
        // Uso del costruttore di copia per clonare pl1
        Playlist pl3 = new Playlist(pl1);

        // 3. Stampa dei dettagli tramite toString()
        System.out.println("--- Catalogo Playlist Attive ---");
        System.out.println("pl1: " + pl1);
        System.out.println("pl2: " + pl2);
        System.out.println("pl3 (copia di pl1): " + pl3);
        System.out.println();

        // 4. Verifica dell'uguaglianza tra oggetti
        System.out.println("La Playlist 1 e la Playlist 2 sono uguali? " + pl1.equals(pl2)); // false
        System.out.println("La Playlist 1 e la Playlist 3 sono uguali? " + pl1.equals(pl3)); // true
        System.out.println();

        // 5. Calcolo delle metriche di durata stimata
        System.out.println("Stima tempistiche per la playlist '" + pl1.toString() + "':");
        System.out.println("Durata totale stimata in secondi: " + pl1.calcolaSecondiTotaliStimati() + "s");
        System.out.println("Durata totale stimata in minuti: " + pl1.calcolaMinutiTotaliStimati() + " min");
        System.out.println();

        // 6. Visualizzazione del contatore statico globale
        System.out.println("Numero totale di playlist create nella piattaforma: " + 
                           Playlist.getConteggioPlaylist()); // Deve stampare 3
    }
}
