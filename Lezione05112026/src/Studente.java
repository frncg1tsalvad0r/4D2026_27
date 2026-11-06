public class Studente {
    public String nome;
    public int eta;

    public Studente(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public Studente(Studente other) {
        this.nome = other.nome;
        this.eta = other.eta;
    }

    public boolean equals(Studente other) {
        if(this.nome.equals(other.nome) && this.eta == other.eta) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Studente [nome=" + nome + ", eta=" + eta + "]";
    }

    
}
