public class Segmento {

    private Punto a;
    private Punto b;
    private int colore;

    private static int contaSegmenti = 0;

    /**
     * Soluzione con i punti condivisi
     * @param a
     * @param b
     */
    /* 
    public Segmento(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }
        */

    public Segmento(Punto a, Punto b) {
        Segmento.contaSegmenti++;
        this.a = new Punto(a);
        this.b = new Punto(b);
    }

    public static int getNumeroSegmenti() {
        return Segmento.contaSegmenti++;
    }
    public void setPuntoA(Punto a) {
        this.a = a;
    }

    public void setPuntoB(Punto b) {
        this.b = b;
    }

    public void setColore(int colore) {
        if (colore < 0)
            return ;
        this.colore = colore;
    }
    public int getColore() {
        return this.colore;
    }

    public Punto getPuntoA() {
        return this.a;
    }

    public Punto getPuntoB() {
        return this.b;
    }

    public String toString() {
        String s = this.a.toString() + "<-->" + this.b.toString();
        return s;
    }
    
    public double calcolaLunghezza() {
        return Math.sqrt( (a.getX() -b.getX())*(a.getX() -b.getX()) + (a.getY() -b.getY())*(a.getY() -b.getY()));
    } 
}
