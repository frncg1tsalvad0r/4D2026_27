import java.util.Scanner;

public class App {

    
    public static void main(String[] args) throws Exception {
        // Crea un programma che popola un array di 5 studenti
        // con i dati letti da tastiera
        Studente[] studenti = new Studente[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci gli studenti");
        for(int i = 0; i < studenti.length; i++) {
            System.out.println("Inserisci i dati dello studente numero " + (i+1));
            System.out.print("Inserisci il nome: ");
            String nome = sc.nextLine();
            System.out.print("Inserisci eta: ");
            int eta = sc.nextInt();
            sc.nextLine();  // Lo faccio per mangiarmi il \n che rompe le scatole.
            Studente stud = new Studente(nome, eta);
            studenti[i] = stud; 


        }

        for(int i = 0; i < studenti.length; i++) {
            System.out.println(studenti[i].toString());
        }


    }
}
