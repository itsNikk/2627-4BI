package Es1;

public class Pesce {
    private String nome;
    private String specie;
    private boolean aggressivo;
    private Vasca vasca;

    public Pesce(String nome, String specie, boolean aggressivo) {
        this.nome = nome;
        this.specie = specie;
        this.aggressivo = aggressivo;
        this.vasca = null;
    }

    public String getNome() {
        return nome;
    }

    public String getSpecie() {
        return specie;
    }

    public boolean isAggressivo() {
        return aggressivo;
    }

    public Vasca getVasca() {
        return vasca;
    }

    public void setVasca(Vasca v) {
        this.vasca = v;
    }
}
