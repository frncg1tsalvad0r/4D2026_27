public class Punto {
    public double x;
    public double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
        Punto.contaPunti++;
    }

    public double distanzaOrigine() {
        return Math.sqrt(this.x*x+y*y);
    }

    public static int contaPunti = 0;
}
