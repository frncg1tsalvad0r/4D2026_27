public class App {
    public static void main(String[] args) throws Exception {
        Punto p1 = new Punto(1,1);
        Punto p2 = new Punto(2,2);
        Punto p3 = new Punto(1, 3);

        Segmento seg1 = new Segmento(p1, p2);
        Segmento seg2 = new Segmento(p1, p3);
        Segmento seg3 = new Segmento(p2, p3);

        System.out.println(seg1.toString());

        System.out.println("La lunghezza del segnmento è: " + seg1.calcolaLunghezza());


        System.out.println(seg1.getNumeroSegmenti());


    }
}
