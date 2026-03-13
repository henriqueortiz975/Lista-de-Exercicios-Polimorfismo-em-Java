package exercicio9_personagens_de_jogo;

public class Paladino extends Personagem {

    private int fe;
    private int defesa;
    private boolean poderSagrado;

    public Paladino(String nome, int nivel, int vida, int fe, int defesa, boolean poderSagrado) {
        super(nome, nivel, vida);
        this.fe = fe;
        this.defesa = defesa;
        this.poderSagrado = poderSagrado;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public boolean isPoderSagrado() {
        return poderSagrado;
    }

    public void setPoderSagrado(boolean poderSagrado) {
        this.poderSagrado = poderSagrado;
    }

    @Override
    public void atacar() {
        System.out.println("O paladino ataca com poder sagrado");
    }
}
