package exercicio1_.sons_de_animais;

public class Cavalo extends Animal {

    private String raca;
    private double velocidade;
    private boolean usadoParaCorrida;

    public Cavalo(String nome, int idade, double peso,
                  String raca, double velocidade, boolean usadoParaCorrida) {
        super(nome, idade, peso);
        this.raca = raca;
        this.velocidade = velocidade;
        this.usadoParaCorrida = usadoParaCorrida;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isUsadoParaCorrida() {
        return usadoParaCorrida;
    }

    public void setUsadoParaCorrida(boolean usadoParaCorrida) {
        this.usadoParaCorrida = usadoParaCorrida;
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo relincha");
    }
}
