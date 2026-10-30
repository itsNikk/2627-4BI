public class Astronauta {
    private String nome;
    private String specializzazione;
    private String[] messaggi;
    private int numMessaggi;
    private ModuloAbitativo alloggio;
    private Esperimento[] esperimenti;
    private int numEsperimenti;
    private Astronauta[] subordinati;
    private int numSubordinati;

    public Astronauta(String nome, String specializzazione) {
        this.nome = nome;
        this.specializzazione = specializzazione;
        this.messaggi = new String[5];
        this.numMessaggi = 0;
        this.alloggio = null;
        this.esperimenti = new Esperimento[3];
        this.numEsperimenti = 0;
        this.subordinati = new Astronauta[6];
        this.numSubordinati = 0;
    }

    public String getNome() { return nome; }
    public ModuloAbitativo getAlloggio() { return alloggio; }
    public void setAlloggio(ModuloAbitativo m) { this.alloggio = m; }
    public int getNumEsperimenti() { return numEsperimenti; }
    public boolean haPostoPerEsperimenti() { return false; }
    public boolean partecipaA(Esperimento e) { return false; }
    public int getNumSubordinati() { return numSubordinati; }
    public boolean aggiungiSubordinato(Astronauta a) { return false; }
    public void riceviMessaggio(String testo) { }
    public int getNumMessaggi() { return numMessaggi; }
    public String getMessaggio(int i) { return null; }
}
