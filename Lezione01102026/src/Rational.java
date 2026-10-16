public class Rational {
    int num;
    int den;

    /**
     * Costruttore con due parametri num e den
     * @param num
     * @param den
     */
    Rational(int num, int den) {
        this.num = num;
        this.den = den;
    }

    void stampa(){
        System.out.print(num + "/" + den);
    }

    /**
     * Somma il numero razionale in question con un altro numero
     * razionale
     * @param other
     * @return
     */
    Rational plus(Rational other) {
        int numPlus = this.num*other.den + other.num*this.den;
        int denPlus = this.den*other.den;
        return new Rational(numPlus, denPlus);
    }

    /**
     * Moltiplicare il numero razionale in questione con un 
     * altro numero
     * @param other
     * @return
     */
    Rational mul(Rational other) {
        int numMul = this.num*other.num;
        int denMul = this.den*other.den;
        return new Rational(numMul, denMul);
    }

    double r() {
        return this.num/this.den;
    }

}
