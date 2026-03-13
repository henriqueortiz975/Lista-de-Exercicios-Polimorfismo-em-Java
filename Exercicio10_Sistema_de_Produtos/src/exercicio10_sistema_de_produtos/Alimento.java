package exercicio10_sistema_de_produtos;

public class Alimento extends Produto {

    private String validade;
    private double peso;
    private boolean perecivel;

    public Alimento(String nome, double preco, String categoria,
                    String validade, double peso, boolean perecivel) {
        super(nome, preco, categoria);
        this.validade = validade;
        this.peso = peso;
        this.perecivel = perecivel;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isPerecivel() {
        return perecivel;
    }

    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.95; 
    }
}
