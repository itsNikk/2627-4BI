public class SerraIdroponica extends ModuloStazione {
    private double superficieColtivata;

    public SerraIdroponica(String codice, double massaTonnellate, double superficieColtivata) {
        super(codice, massaTonnellate);
        this.superficieColtivata = superficieColtivata;
    }

    @Override
    public double consumoEnergetico() { return 0; }
}
