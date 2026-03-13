package exercicio1_.sons_de_animais;

public class Leao extends Animal {

    private String habitat;
    private boolean liderDoBando;
    private int forca;

    public Leao(String nome, int idade, double peso,
                String habitat, boolean liderDoBando, int forca) {
        super(nome, idade, peso);
        this.habitat = habitat;
        this.liderDoBando = liderDoBando;
        this.forca = forca;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isLiderDoBando() {
        return liderDoBando;
    }

    public void setLiderDoBando(boolean liderDoBando) {
        this.liderDoBando = liderDoBando;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void emitirSom() {
        System.out.println("O leão ruge");
    }
}

