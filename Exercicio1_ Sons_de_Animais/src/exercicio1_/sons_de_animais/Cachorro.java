package exercicio1_.sons_de_animais;

public class Cachorro extends Animal {

    private String raca;
    private boolean lateMuito;
    private String tamanho;

    public Cachorro(String nome, int idade, double peso,
                    String raca, boolean lateMuito, String tamanho) {
        super(nome, idade, peso);
        this.raca = raca;
        this.lateMuito = lateMuito;
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isLateMuito() {
        return lateMuito;
    }

    public void setLateMuito(boolean lateMuito) {
        this.lateMuito = lateMuito;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro late");
    }
}
