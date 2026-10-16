public class App {
    public static void main(String[] args) throws Exception {
        Punto p = new Punto(9);
        Punto q = new Punto(10,20,30);
        Punto u = new Punto();


        q.stampa();
        System.out.println("Somma coordinate " +q.sommaCoordinate());

        System.out.println("Somma coordinate " + q.distanzaPunto(u));

        if(p.equals(u)) {
            System.out.println("Sono uguali");
        } else {
            System.out.println("Sono diversi");
        }
    }
}
