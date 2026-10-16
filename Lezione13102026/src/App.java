public class App {
    public static void main(String[] args) throws Exception {
        Punto v1 = new Punto(1,1);
        System.out.println(v1.toString());

        Punto v2 = new Punto(1, 2);
        System.out.println(v2.toString());

        Punto v3 = new Punto(2,2);
        System.out.println(v2.toString());

        Punto v11 = new Punto(4,4);
        System.out.println(v2.toString());

        Punto v12 = new Punto(4,3);
        System.out.println(v2.toString());

        Triangolo t = new Triangolo(v1, v2, v3);

        Triangolo t1 = new Triangolo(v11, v12, v3);

        Triangolo t2 = new Triangolo(t1);

        System.out.println(t.toString());
        System.out.println(t.perimetro());
    }
}
