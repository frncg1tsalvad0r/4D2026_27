public class App {
    public static void main(String[] args) throws Exception {
        Punto p = new Punto();
        Punto p1 = new Punto();

        
        double d = 10;
        p.x = 10;
        p.y = 20;

        p1.x = 5;
        p1.y = 7;
        /*
        stampa(p);
        stampa(p1);
        System.out.println(distanzaOrigine(p));
        */
        p.stampa();
        p1.stampa();
        System.out.println(p.distanzaOrigine());

    }

    static public void stampa(Punto o) {
        System.out.println(o.x + "-" + o.y);
    }

    static public double distanzaOrigine(Punto p) {
        double dis;
        dis = Math.sqrt(p.x*p.x + p.y*p.y);
        return dis;
    }
}
