public class App {
    public static void main(String[] args)  {

        stampaN(10);
        double r = somma(30,4) + 60;
        System.out.println(r);
    }

    public static void  stampaN(int n) {
         for (int i = 0; i < n; i++) {
            System.out.println("Hello, World!");
        }
    }

    public static double somma(double par1, double par2) {
        double s = par1 + par2;
        return s;
    }
}
