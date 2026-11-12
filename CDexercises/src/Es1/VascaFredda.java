package Es1;

public class VascaFredda extends Vasca {
    private double salinita;

    public VascaFredda(String codice, double litri, double salinita) {
        super(codice, litri);
        this.salinita = salinita;
    }

    @Override
    public double costoGiornaliero() {
        return 6.0 + 1.5 * getNumPesci();
    }
}
