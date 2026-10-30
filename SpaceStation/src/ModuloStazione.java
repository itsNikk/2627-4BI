public abstract class ModuloStazione {
    protected String codice;
    protected double massaTonnellate;

    public ModuloStazione(String codice, double massaTonnellate) {
        this.codice = codice;
        this.massaTonnellate = massaTonnellate;
    }

    public String getCodice() { return codice; }
    public double getMassaTonnellate() { return massaTonnellate; }
    public abstract double consumoEnergetico();
    public String descrizione() { return null; }
}
