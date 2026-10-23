public class StazioneSpaziale {
    private PannelloControllo pannelloControllo;
    //array=vettore
    private ModuloStazione[] moduli;

    public StazioneSpaziale(PannelloControllo pannelloControllo){
        this.pannelloControllo = pannelloControllo;
        this.moduli = new ModuloStazione[12];
    }

}
