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
    public boolean aggiungiModulo(ModuloStazione m) {
        if (numModuli == moduli.length) return false;
        if (trovaModulo(m.getCodice()) != null) return false;
        moduli[numModuli] = m;
        numModuli++;
        return true;
    }
    public boolean rimuoviModulo(String codice) { return false; }
    private ModuloStazione trovaModulo(String codice) {
        for (int i = 0; i < numModuli; i++) {
            if (moduli[i].getCodice().equals(codice)) {
                return moduli[i];
            }
        }
        return null;
    }
    public double massaTotale() {
        double totale = 0;
        for (int i = 0; i < numModuli; i++) totale = totale + moduli[i].getMassaTonnellate();
        return totale;
    }
    public double consumoTotale() {
        double totale = 0;
        for (int i = 0; i < numModuli; i++) {
            totale = totale + moduli[i].consumoEnergetico();
        }
        return totale;
    }
    public double bilancioEnergetico() {
        return potenzaPannelliKw - consumoTotale();
    }
    public ModuloStazione moduloPiuEnergivoro() { return null; }
    public int eseguiDiagnostica() { return 0; }
}
