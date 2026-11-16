public class Contatore {
    private static int conta = 0;

    public int incrementa() {
        Contatore.conta++;
        return Contatore.conta++;
    }

    public static void azzera(){
       Contatore.conta = 0; 
    }
}
