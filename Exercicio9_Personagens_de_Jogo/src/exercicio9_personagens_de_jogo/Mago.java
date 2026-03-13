package exercicio9_personagens_de_jogo;

public class Mago extends Personagem {

    private int mana;
    private String elemento;
    private int poderMagico;

    public Mago(String nome, int nivel, int vida, int mana, String elemento, int poderMagico) {
        super(nome, nivel, vida);
        this.mana = mana;
        this.elemento = elemento;
        this.poderMagico = poderMagico;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    @Override
    public void atacar() {
        System.out.println("O mago lança uma magia");
    }
}
