package exercicio3_instrumentos_musicais;

public class Flauta extends Instrumento {

    private String material;
    private String tonalidade;
    private boolean profissional;

    public Flauta(String nome, String tipo, String fabricante,
            String material, String tonalidade, boolean profissional) {
        super(nome, tipo, fabricante);
        this.material = material;
        this.tonalidade = tonalidade;
        this.profissional = profissional;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTonalidade() {
        return tonalidade;
    }

    public void setTonalidade(String tonalidade) {
        this.tonalidade = tonalidade;
    }

    public boolean isProfissional() {
        return profissional;
    }

    public void setProfissional(boolean profissional) {
        this.profissional = profissional;
    }

    @Override
    public void tocar() {
        System.out.println("A flauta está tocando");
    }
}
