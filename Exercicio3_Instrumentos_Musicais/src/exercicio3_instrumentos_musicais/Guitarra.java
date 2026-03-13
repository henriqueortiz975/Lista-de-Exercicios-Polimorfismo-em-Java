package exercicio3_instrumentos_musicais;

public class Guitarra extends Instrumento {

    private int captadores;
    private String tipoPonte;
    private boolean distorcao;

    public Guitarra(String nome, String tipo, String fabricante, int captadores, String tipoPonte, boolean distorcao) {
        super(nome, tipo, fabricante);
        this.captadores = captadores;
        this.tipoPonte = tipoPonte;
        this.distorcao = distorcao;
    }

    public int getCaptadores() {
        return captadores;
    }

    public void setCaptadores(int captadores) {
        this.captadores = captadores;
    }

    public String getTipoPonte() {
        return tipoPonte;
    }

    public void setTipoPonte(String tipoPonte) {
        this.tipoPonte = tipoPonte;
    }

    public boolean isDistorcao() {
        return distorcao;
    }

    public void setDistorcao(boolean distorcao) {
        this.distorcao = distorcao;
    }

    @Override
    public void tocar() {
        System.out.println("A guitarra está tocando");
    }
}
