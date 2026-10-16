public class App {
    public static void main(String[] args) throws Exception {
       Rational n1 = new Rational(1,3);
       Rational n2 = new Rational(2, 3);
       Rational n3 = n1.plus(n2);
       n3.stampa();
       System.out.println();
       System.out.println(n3.r());

       System.out.println(0.1+0.2);
    }
}
