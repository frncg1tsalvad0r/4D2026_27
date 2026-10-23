class Brano {
    private String titolo;       // Campo Stringa
    private int durataInSecondi; // Campo Intero

    // Costruttore Standard
    public Brano(String titolo, int durataInSecondi) {
        this.titolo = titolo;
        this.durataInSecondi = durataInSecondi;
    }

    // Costruttore di Copia
    public Brano(Brano altro) {
        this.titolo = altro.titolo;
        this.durataInSecondi = altro.durataInSecondi;
    }

    public String getTitolo() { return titolo; }
    public int getDurataInSecondi() { return durataInSecondi; }

    @Override
    public String toString() {
        return "[" + titolo + " - " + durataInSecondi + "s]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Brano brano = (Brano) obj;
        return durataInSecondi == brano.durataInSecondi && 
               titolo.equalsIgnoreCase(brano.titolo);
    }
}