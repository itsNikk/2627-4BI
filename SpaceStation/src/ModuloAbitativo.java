public class ModuloAbitativo extends ModuloStazione {
    private double volumeAbitabile;
    private Astronauta[] occupanti;
    private int numOccupanti;

    public ModuloAbitativo(String codice, double massaTonnellate, double volumeAbitabile) {
        super(codice, massaTonnellate);
        this.volumeAbitabile = volumeAbitabile;
        this.occupanti = new Astronauta[4];
        this.numOccupanti = 0;
    }

    public int getNumOccupanti() { return numOccupanti; }
    public boolean aggiungiOccupante(Astronauta a) { return false; }
    public boolean rimuoviOccupante(Astronauta a) { return false; }

    @Override
    public double consumoEnergetico() { return 0; }
}
