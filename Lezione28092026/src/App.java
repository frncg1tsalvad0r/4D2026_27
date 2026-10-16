
public class App {
    public static void main(String[] args) throws Exception {
        Rettangolo r = new Rettangolo(5, 7);
        Rettangolo r1 = new Rettangolo(10, 3);
        //*Rettangolo r2 = new Rettangolo();
        /*r.base = 5;
        r.altezza = 7;*/
        double area = r.base * r.altezza;
        System.out.println("area r: " + area);
        System.out.println("area r: " + r.calcolaArea());
        System.out.println("perimetro r: " + r.calcolaPerimetro());
        /*r1.base = 10;
        r1.altezza = 3;*/
        System.out.println("area r1: " + r1.calcolaArea());
        System.out.println("perimetro r1: " + r1.calcolaPerimetro());
        r.stampa();
        r1.stampa();
    }
}
