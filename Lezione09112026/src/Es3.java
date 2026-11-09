import java.util.Scanner;
public class Es3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Inserisci il primo voto: ");
        String testo1=in.nextLine();
        System.out.print("Inserisci il secondo voto: ");
        String testo2=in.nextLine();
        System.out.println("Inserisci il terzo voto: ");
        String testo3=in.nextLine();
        double voto1=Double.parseDouble(testo1);
        double voto2=Double.parseDouble(testo2);
        double voto3=Double.parseDouble(testo3);
        double media=(voto1+voto2+voto3)/3;
        System.out.println("Media: "+media);
        if(media>=6){
            System.out.println("Studente promesso");
        }else{
            System.out.println("Studente non promosso");
        }
        in.close();
    }
}
