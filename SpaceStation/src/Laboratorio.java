public class Laboratorio extends ModuloStazione {
    private String disciplina;
    private Esperimento[] esperimenti;
    private int numEsperimenti;

    public Laboratorio(String codice, double massaTonnellate, String disciplina) {
        super(codice, massaTonnellate);
        this.disciplina = disciplina;
        this.esperimenti = new Esperimento[5];
        this.numEsperimenti = 0;
    }

    public int getNumEsperimenti() { return numEsperimenti; }
    public boolean avviaEsperimento(Esperimento e) { return false; }
    public int esperimentiInCorso() { return 0; }

    @Override
    public double consumoEnergetico() { return 0; }
}
