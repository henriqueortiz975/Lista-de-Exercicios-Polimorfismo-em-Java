package exercicio1_.sons_de_animais;

public class Gato extends Animal {

    private String cor;
    private boolean gostaDormir;
    private int vidas;

    public Gato(String nome, int idade, double peso,
                String cor, boolean gostaDormir, int vidas) {
        super(nome, idade, peso);
        this.cor = cor;
        this.gostaDormir = gostaDormir;
        this.vidas = vidas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isGostaDormir() {
        return gostaDormir;
    }

    public void setGostaDormir(boolean gostaDormir) {
        this.gostaDormir = gostaDormir;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato mia");
    }
}
