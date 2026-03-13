package exercicio1_.sons_de_animais;

public class Vaca extends Animal {

    private String raca;
    private double producaoLeite;
    private boolean temChifre;

    public Vaca(String nome, int idade, double peso,
                String raca, double producaoLeite, boolean temChifre) {
        super(nome, idade, peso);
        this.raca = raca;
        this.producaoLeite = producaoLeite;
        this.temChifre = temChifre;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getProducaoLeite() {
        return producaoLeite;
    }

    public void setProducaoLeite(double producaoLeite) {
        this.producaoLeite = producaoLeite;
    }

    public boolean isTemChifre() {
        return temChifre;
    }

    public void setTemChifre(boolean temChifre) {
        this.temChifre = temChifre;
    }

    @Override
    public void emitirSom() {
        System.out.println("A vaca faz som");
    }
}
