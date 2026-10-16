public class Triangolo {
    
    private Punto a;
    private Punto b;
    private Punto c;
    
    /*
    Questo costruttore prevede che i punti dei vertici siano condivisi
    public Triangolo(Punto a, Punto b, Punto c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    */
    
    public Triangolo(Punto a, Punto b, Punto c) {
        this.a = new Punto(a);
        this.b = new Punto(b);
        this.c = new Punto(c);
    }

    public Triangolo(Triangolo other) {
        this.a = new Punto(other.a.getX(), other.a.getY());
        this.b = new Punto(other.b.getX(), other.b.getY()); 
        this.c = new Punto(other.c.getX(), other.c.getY());
    }

    public void setA(Punto p) {
        this.a = new Punto(p);
    }

    public void setB(Punto p) {
        this.b = new Punto(p);
    }

    public void setC(Punto p) {
        this.c = new Punto(p);
    }

    public Punto getA() {
        return this.a;
    }

    public Punto getB() {
        return this.b;
    }

    public Punto getC() {
        return this.c;
    }

    public String toString() {
        String s = "[" + this.a.toString() 
                + " " + this.b.toString()
                + " " + this.c.toString() + "]";
        return s;
    }

    public double perimetro() {
        double per = this.a.distanza(this.b) +
                    this.b.distanza(this.c) +
                    this.c.distanza(a);
        return per;
    }
}
