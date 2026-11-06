public class Main {
    public static void main(String[] args) {
        PannelloControllo pannelloControllo = new PannelloControllo(12);
        StazioneSpaziale staz =
                new StazioneSpaziale("NomeStaz", 12, 34, pannelloControllo);

        SerraIdroponica serraIdroponica = new SerraIdroponica("S1", 123, 44);
        Laboratorio l = new Laboratorio("L1", 50, "medicina");

        System.out.println(staz.aggiungiModulo(serraIdroponica));
        System.out.println(staz.aggiungiModulo(serraIdroponica));
        System.out.println(staz.aggiungiModulo(l));

        System.out.println(serraIdroponica.descrizione());
        System.out.println(staz.massaTotale());
    }
}
