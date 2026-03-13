package exercicio9_personagens_de_jogo;

public class Guerreiro extends Personagem {

    private int forca;
    private String arma;
    private int defesa;

    public Guerreiro(String nome, int nivel, int vida, int forca, String arma, int defesa) {
        super(nome, nivel, vida);
        this.forca = forca;
        this.arma = arma;
        this.defesa = defesa;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public void atacar() {
        System.out.println("O guerreiro ataca com sua espada");
    }
}
