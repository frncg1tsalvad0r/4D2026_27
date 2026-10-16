public class Punto {
    public double x;
    public double y;

    public void stampa() {
        System.out.println(this.x + "-" + this.y);
    }

    public double distanzaOrigine() {
        double dis;
        dis = Math.sqrt(this.x*this.x + this.y*this.y);
        return dis;
    }
    /*
    static public void stampa(Punto this) {
        System.out.println(this.x + "-" + this.y);
    }

    static public double distanzaOrigine(Punto this) {
        double dis;
        dis = Math.sqrt(this.x*this.x + this.y*this.y);
        return dis;
    }
    */
}


