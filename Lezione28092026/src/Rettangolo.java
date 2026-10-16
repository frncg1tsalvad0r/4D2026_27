public class Rettangolo {
    double base;
    double altezza;
    
    Rettangolo(double b, double h){
        this.base = b;
        this.altezza = h;
    }

    double calcolaArea(/*Rettangolo this */){
        return this.base * this.altezza;
    }

    double calcolaPerimetro(){
        return (this.base + this.altezza)*2;
    }

    void stampa(){
        System.out.println("base: " + this.base);
        System.out.println("altezza: " + this.altezza);
    }
}
