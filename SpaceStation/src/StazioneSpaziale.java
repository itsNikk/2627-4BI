public class StazioneSpaziale {
    private String nome;
    private int quotaInKm;
    private PannelloControllo pannelloControllo;
    private Modulo[] moduli;
    private int numModuli = 0;

    public StazioneSpaziale(String nome, int quotaInKm, PannelloControllo pannelloControllo) {
        this.nome = nome;
        this.quotaInKm = quotaInKm;
        this.pannelloControllo = pannelloControllo;
        this.numModuli = 0;
        this.moduli = new Modulo[12];
    }

    public boolean addModulo(Modulo m) {
        if (numModuli == moduli.length) return false;

        //TODO: posso inserire sempre?

        moduli[numModuli] = m;
        numModuli++;
        return true;
    }

    public boolean deleteModulo(String moduleCode) {
        //HOW?
        for (int i = 0; i < moduli.length; i++) {
            if (moduli[i].getCode().equals(moduleCode)) {
                moduli[getNumeroModuli() - 1] = null;
                setNumeroModuli(getNumeroModuli() - 1);
                numModuli--;
                return true;
            }
        }
        return false;
    }

    public int getNumeroModuli() {
        return moduli.length;
    }

    public void setNumeroModuli(int newValue) {
        numModuli = newValue;
    }


}
