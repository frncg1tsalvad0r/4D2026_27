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

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        scanner.close();
    }
}
