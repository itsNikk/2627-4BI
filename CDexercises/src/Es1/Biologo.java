package Es1;

public class Biologo {
    private String nome;

    public Biologo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String controlla(Vasca v) {
        if (v.getNumPesci() * 200 > v.getLitri()) return v.getCodice() + ": SOVRAFFOLLATA";
        return v.getCodice() + ": OK";
    }

    public boolean trasferisci(Pesce p, Vasca destinazione) {
        Vasca partenza = p.getVasca();
        if (partenza == null || partenza == destinazione) return false;

        partenza.rimuoviPesce(p);
        if (destinazione.inserisciPesce(p)) return true;

        partenza.inserisciPesce(p);
        return false;
    }
}
