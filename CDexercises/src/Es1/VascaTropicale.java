package Es1;

public class VascaTropicale extends Vasca {
    private double temperatura;

    public VascaTropicale(String codice, double litri, double temperatura) {
        super(codice, litri);
        this.temperatura = temperatura;
    }

    @Override
    public double costoGiornaliero() {
        return 10.0 + 2.0 * getNumPesci();
    }
}
