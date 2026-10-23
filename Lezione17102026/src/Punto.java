public class Punto {
    private double x;
    private double y;

    // Costruttori
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto other) {
        this.x = other.getX();
        this.y = other.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double distanza(Punto other) {
        double d = (this.x - other.getX())*(this.x - other.getX()) +
         (this.y - other.getY())*(this.y- other.getY());
        return Math.sqrt(d);
    }

    public boolean equals(Punto other) {
        if(other.x == this.x && other.y == this.y) {
            return true;
        } else
            return false;
    }

    public String toString() {
        String s = "(" + this.x + "," + this.y + ")";
        return s;
    }
}
