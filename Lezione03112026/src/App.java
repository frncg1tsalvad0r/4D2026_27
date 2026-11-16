public class App {
    public static void main(String[] args) throws Exception {
        int[] b = new int[] {100,200,300};
        int[] a = new int[5];
        for(int i = 0; i < 5; i++) {
            a[i]= i;
        }

        for(int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

        for (int val : b) {
            System.out.println(val);
        }

        
    }
}
