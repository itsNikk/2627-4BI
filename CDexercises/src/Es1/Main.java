package Es1;

public class Main {

    private static String esito(boolean ok) {
        return ok ? "riuscito" : "rifiutato";
    }

    private static String vascaDi(Pesce p) {
        if (p.getVasca() == null) return "nessuna";
        return p.getVasca().getCodice();
    }

    public static void main(String[] args) {
        Acquario abissi = new Acquario("Abissi");
        VascaTropicale t1 = new VascaTropicale("T1", 2000, 26);
        VascaFredda f1 = new VascaFredda("F1", 1500, 35);
        VascaTropicale t2 = new VascaTropicale("T2", 600, 28);
        System.out.println("Abissi aggiunge T1: " + esito(abissi.aggiungiVasca(t1)));
        System.out.println("Abissi aggiunge F1: " + esito(abissi.aggiungiVasca(f1)));
        System.out.println("Abissi aggiunge T2: " + esito(abissi.aggiungiVasca(t2)));
        System.out.println("Abissi aggiunge un'altra T1: " + esito(abissi.aggiungiVasca(new VascaFredda("T1", 900, 30))));

        Pesce lino = new Pesce("Lino", "pesce pagliaccio", false);
        Pesce gea = new Pesce("Gea", "pesce chirurgo", false);
        Pesce rex = new Pesce("Rex", "murena", true);
        Pesce ombra = new Pesce("Ombra", "barracuda", true);
        Pesce bolla = new Pesce("Bolla", "pesce palla", false);
        Pesce perla = new Pesce("Perla", "cavalluccio marino", false);
        System.out.println("T1 accoglie Lino: " + esito(t1.inserisciPesce(lino)) + ", vasca di Lino: " + vascaDi(lino));
        System.out.println("T1 accoglie Gea: " + esito(t1.inserisciPesce(gea)));
        System.out.println("T1 accoglie Rex: " + esito(t1.inserisciPesce(rex)));
        System.out.println("T1 accoglie Ombra: " + esito(t1.inserisciPesce(ombra)) + ", vasca di Ombra: " + vascaDi(ombra));
        System.out.println("F1 accoglie Bolla: " + esito(f1.inserisciPesce(bolla)));
        System.out.println("T2 accoglie Lino: " + esito(t2.inserisciPesce(lino)) + ", vasca di Lino: " + vascaDi(lino));

        System.out.println(t1.descrizione());
        System.out.println(f1.descrizione());
        System.out.println(t2.descrizione());
        System.out.println("Costo giornaliero totale: " + abissi.costoGiornalieroTotale() + " euro, vasca piu' costosa: " + abissi.vascaPiuCostosa().getCodice());

        Biologo marina = new Biologo("Marina");
        System.out.println("T2 accoglie Perla: " + esito(t2.inserisciPesce(perla)));
        System.out.println("T2 accoglie Ombra: " + esito(t2.inserisciPesce(ombra)));
        System.out.println(marina.controlla(t2));
        System.out.println("Marina trasferisce Gea in T2: " + esito(marina.trasferisci(gea, t2)) + ", vasca di Gea: " + vascaDi(gea));
        System.out.println(marina.controlla(t2));
        System.out.println("Marina trasferisce Rex in T2: " + esito(marina.trasferisci(rex, t2)) + ", vasca di Rex: " + vascaDi(rex) + ", pesci in T1: " + t1.getNumPesci());
        System.out.println("Marina trasferisce Bolla in F1: " + esito(marina.trasferisci(bolla, f1)));
        Pesce zeta = new Pesce("Zeta", "pesce angelo", false);
        System.out.println("Marina trasferisce Zeta in F1: " + esito(marina.trasferisci(zeta, f1)) + ", vasca di Zeta: " + vascaDi(zeta));

        for (int i = 1; i <= 9; i++) f1.inserisciPesce(new Pesce("Sardina" + i, "sardina", false));

        System.out.println("F1 ha " + f1.getNumPesci() + " pesci; accoglie l'undicesimo: " + esito(f1.inserisciPesce(new Pesce("Sardina10", "sardina", false))));
        System.out.println(marina.controlla(f1));

        System.out.println("T1 toglie Lino: " + esito(t1.rimuoviPesce(lino)) + ", vasca di Lino: " + vascaDi(lino));
        System.out.println("T1 toglie di nuovo Lino: " + esito(t1.rimuoviPesce(lino)));
        System.out.println("Costo giornaliero totale: " + abissi.costoGiornalieroTotale() + " euro, vasca piu' costosa: " + abissi.vascaPiuCostosa().getCodice());
    }
}
