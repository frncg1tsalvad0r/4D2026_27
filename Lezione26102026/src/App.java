public class App {

    // Scrivere una funzione che, dato in array di interi ritorna la media degli elementi

    static float media(float[] valori) {
        float media = 0;
        for (float f : valori) {
            media += f;
        }
        return media;
    }

    public static void main(String[] args) throws Exception {
        float[] a = new float[5];
        a[0] = 10;
        a[1] = 3;
        a[2] = 2;
        a[3] = 14;
        a[4] = 73;
        

        float media = media(a);
        for (float f : a) {
            System.out.println(f);
        }

        System.out.println("La media è: " + media);

        System.out.println(media);

    }
}
