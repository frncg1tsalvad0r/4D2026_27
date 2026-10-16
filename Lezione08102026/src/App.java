public class App {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        Lampada l2 = new Lampada(8, 700);
    
        System.out.println(l1.toString());
        System.out.println(l2.toString());

        l1.accendi();
        System.out.println(l1.toString());
    }

}
