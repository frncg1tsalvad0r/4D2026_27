import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci un lato del tringolo");
        double lato1 = sc.nextDouble();
        System.out.print("Inserisci altro lato del tringolo");
        double lato2 = sc.nextDouble();

        double ipotenusa = Utils.ipotenusaTriangoloRettangolo(lato1, lato2);

        System.out.println("L'ipotenusa è : " + ipotenusa);
    }
}
