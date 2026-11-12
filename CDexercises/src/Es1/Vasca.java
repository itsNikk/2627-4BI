package Es1;

public abstract class Vasca {
    protected String codice;
    protected double litri;
    private Pesce[] pesci;
    private int numPesci;

    public Vasca(String codice, double litri) {
        this.codice = codice;
        this.litri = litri;
        this.pesci = new Pesce[10];
        this.numPesci = 0;
    }

    public String getCodice() {
        return codice;
    }

    public double getLitri() {
        return litri;
    }

    public int getNumPesci() {
        return numPesci;
    }

    private boolean contieneAggressivo() {
        for (int i = 0; i < numPesci; i++) if (pesci[i].isAggressivo()) return true;
        return false;
    }

    public boolean inserisciPesce(Pesce p) {
        if (numPesci == pesci.length) return false;
        if (p.getVasca() != null) return false;
        if (p.isAggressivo() && contieneAggressivo()) return false;

        pesci[numPesci] = p;
        numPesci++;
        p.setVasca(this);
        return true;
    }

    public boolean rimuoviPesce(Pesce p) {
        for (int i = 0; i < numPesci; i++) {
            if (pesci[i] == p) {
                for (int j = i; j < numPesci - 1; j++) pesci[j] = pesci[j + 1];

                pesci[numPesci - 1] = null;
                numPesci--;
                p.setVasca(null);
                return true;
            }
        }
        return false;
    }

    public abstract double costoGiornaliero();

    public String descrizione() {
        return codice + " (" + litri + " l), pesci: " + numPesci + ", costo: " + costoGiornaliero() + " euro";
    }
}
