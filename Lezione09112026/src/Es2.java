import java.util.Scanner;
public class Es2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String numTot,venduti;
        System.out.println("Inserire il numero totale di posti");
        numTot=sc.nextLine();
        System.out.println("Inserire i posti venduti");
        venduti=sc.nextLine();
        int venduti1=Integer.parseInt(venduti);
        int numTot1=Integer.parseInt(numTot);
        if(venduti1<=numTot1 && numTot1>0 && venduti1>0){
            int tot=numTot1-venduti1;
            if (tot==0) {
                System.out.println("La sala e' completa");
            }
            else{
                System.out.println("I posti totali sono "+numTot1+", i posti venduti sono "+venduti1+". Ci sono ancora "+tot+" posti disponibili");
            }
        }
        else{
            System.out.println("Inserimenti errati");
        }
        sc.close();
    }
}
