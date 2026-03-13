package exercicio3_instrumentos_musicais;

public class Violao extends Instrumento {

    private int cordas;
    private String madeira;
    private boolean eletrico;

    public Violao(String nome, String tipo, String fabricante, int cordas, String madeira, boolean eletrico) {
        super(nome, tipo, fabricante);
        this.cordas = cordas;
        this.madeira = madeira;
        this.eletrico = eletrico;
    }

    public int getCordas() {
        return cordas;
    }

    public void setCordas(int cordas) {
        this.cordas = cordas;
    }

    public String getMadeira() {
        return madeira;
    }

    public void setMadeira(String madeira) {
        this.madeira = madeira;
    }

    public boolean isEletrico() {
        return eletrico;
    }

    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }

    @Override
    public void tocar() {
        System.out.println("O violão está tocando");
    }
}
