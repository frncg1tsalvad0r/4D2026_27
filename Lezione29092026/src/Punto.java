public class Punto {
    double x;
    double y;
    double z;

    Punto(){
        this.x = 1;
        this.y = 1;
        this.z = 1;
    }
    Punto(double a){
        this.x = a;
        this.y = a;
        this.z = a;
    }
    Punto(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    double sommaCoordinate() {
       return this.x+this.y+this.z;
    }

    void stampa() {
        System.err.println(this.x + " " + this.y + " " + this.z);
    }

    double distanzaPunto(Punto other) {
        return Math.sqrt(Math.pow(this.x-other.x, 2) +
        Math.pow(this.x-other.x, 2) +
        Math.pow(this.x-other.x, 2));


    }

    boolean equals(Punto other) {
        return this.x == other.x && this.y == other.y && this.z==other.z;
    }
}
