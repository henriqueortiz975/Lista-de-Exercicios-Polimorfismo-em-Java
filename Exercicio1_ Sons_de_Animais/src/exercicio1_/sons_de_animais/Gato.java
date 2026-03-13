package exercicio1_.sons_de_animais;

public class Gato extends Animal {

    private String raca;
    private String cor;
    private boolean temBigode;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTemBigode() {
        return temBigode;
    }

    public void setTemBigode(boolean temBigode) {
        this.temBigode = temBigode;
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }
}
