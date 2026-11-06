import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * 1) Creare un array di dimensione 10
         * 2) popolarlo con valori interi inseriti dall'utente
         * 3) Usare un ciclo per stampare i valori 
         *      precedentemente inseriti dall'utente nell'array
         */
        
        int[] array = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire 10 numeri: ");

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int valMin = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] < valMin) {
                valMin = array[i];
            }
        }

        System.out.println("Il minimo e': " + valMin);

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int ultimo = array[array.length - 1];

        for(int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
            
        }

        array[0] = ultimo;

        System.out.println("\n");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}