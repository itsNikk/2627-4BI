package Es1;

public class Acquario {
    private String nome;
    private Vasca[] vasche;
    private int numVasche;

    public Acquario(String nome) {
        this.nome = nome;
        this.vasche = new Vasca[8];
        this.numVasche = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNumVasche() {
        return numVasche;
    }

    private Vasca trovaVasca(String codice) {
        for (int i = 0; i < numVasche; i++) {
            if (vasche[i].getCodice().equals(codice)) return vasche[i];
        }
        return null;
    }

    public boolean aggiungiVasca(Vasca v) {
        if (numVasche == vasche.length) return false;
        if (trovaVasca(v.getCodice()) != null) return false;

        vasche[numVasche] = v;
        numVasche++;
        return true;
    }

    public double costoGiornalieroTotale() {
        double totale = 0;
        for (int i = 0; i < numVasche; i++) totale = totale + vasche[i].costoGiornaliero();
        return totale;
    }

    public Vasca vascaPiuCostosa() {
        if (numVasche == 0) return null;
        Vasca max = vasche[0];
        for (int i = 1; i < numVasche; i++) {
            if (vasche[i].costoGiornaliero() > max.costoGiornaliero()) max = vasche[i];
        }
        return max;
    }
}
