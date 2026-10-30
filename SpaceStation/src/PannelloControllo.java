public class PannelloControllo {
    private double sogliaAllarmeKw;

    public PannelloControllo(double sogliaAllarmeKw) {
        this.sogliaAllarmeKw = sogliaAllarmeKw;
    }

    public double getSogliaAllarmeKw() { return sogliaAllarmeKw; }
    public boolean inAllarme(ModuloStazione m) { return false; }
    public String diagnostica(ModuloStazione m) { return null; }
    public void inviaAllerta(Astronauta a, String testo) { }
}
