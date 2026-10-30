public class StazioneSpaziale {
    private String nome;
    private int quotaOrbitaleKm;
    private double potenzaPannelliKw;
    private PannelloControllo pannello;
    private ModuloStazione[] moduli;
    private int numModuli;

    public StazioneSpaziale(String nome, int quotaOrbitaleKm, double potenzaPannelliKw, PannelloControllo pannello) {
        this.nome = nome;
        this.quotaOrbitaleKm = quotaOrbitaleKm;
        this.potenzaPannelliKw = potenzaPannelliKw;
        this.pannello = pannello;
        this.moduli = new ModuloStazione[12];
        this.numModuli = 0;
    }

    public String getNome() { return nome; }
    public PannelloControllo getPannello() { return pannello; }
    public int getNumModuli() { return numModuli; }
    public boolean aggiungiModulo(ModuloStazione m) { return false; }
    public boolean rimuoviModulo(String codice) { return false; }
    private ModuloStazione trovaModulo(String codice) { return null; }
    public double massaTotale() { return 0; }
    public double consumoTotale() { return 0; }
    public double bilancioEnergetico() { return 0; }
    public ModuloStazione moduloPiuEnergivoro() { return null; }
    public int eseguiDiagnostica() { return 0; }
}
