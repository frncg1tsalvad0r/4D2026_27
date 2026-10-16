public class Studente {
    public int anni;
    public String nome;

    public boolean eMaggiorenne(/*Studente this*/){
        if(this.anni >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
