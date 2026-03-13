package exercicio1_.sons_de_animais;

public class Cachorro extends Animal {

    private String raca;
    private String cor;
    private boolean domesticado;

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

    public boolean isDomesticado() {
        return domesticado;
    }

    public void setDomesticado(boolean domesticado) {
        this.domesticado = domesticado;
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}
