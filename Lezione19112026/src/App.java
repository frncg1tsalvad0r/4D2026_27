public class App {
    public static void main(String[] args) throws Exception {
        Uccello u = new Uccello();
        u.vola();
        u.comunica();

        Rettile r = new Rettile();
        r.striscia();
        r.comunica();

        Animale r1 = new Rettile();
        r1.comunica();
    }







        /*
        Rettile r = new Rettile();
        r.striscia();
        

        // Un uccello è un animale
        Animale u1 = new Uccello();
        // Un rettile è un animale
        Animale r1 = new Rettile();

        /* Un animale non è detto che sia un uccello o un rettile 
        Uccello u2 = new Animale();
        Rettile r2 = new Animale();
        */


        
}
