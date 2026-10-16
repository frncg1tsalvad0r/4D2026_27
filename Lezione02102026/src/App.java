public class App {

    public static void boh() {
        Veicolo v= new Veicolo("Fiat", "Panda", "BX001FK", "Benzina", 0.5, 4);

    }

    public static void main(String[] args) throws Exception {
        Veicolo v= new Veicolo("Fiat", "Panda", "BX001FK", "Benzina", 0.5, 4);

        v.setTarga("AS000GH");
        
        Veicolo v1 = v;

        System.out.println(v1.getPotenza());

        boh();
    }
}
