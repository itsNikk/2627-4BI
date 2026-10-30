public class Esperimento {
    private String titolo;
    private int giorniRimanenti;
    private Astronauta[] ricercatori;
    private int numRicercatori;

    public Esperimento(String titolo, int durataGiorni) {
        this.titolo = titolo;
        this.giorniRimanenti = durataGiorni;
        this.ricercatori = new Astronauta[3];
        this.numRicercatori = 0;
    }

    public String getTitolo() { return titolo; }
    public int getNumRicercatori() { return numRicercatori; }
    public boolean aggiungiRicercatore(Astronauta a) { return false; }
    public void avanzaGiorni(int n) { }
    public boolean isConcluso() { return false; }
}
