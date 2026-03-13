package exercicio10_sistema_de_produtos;

public class Movel extends Produto {

    private String material;
    private double peso;
    private double custoEntrega;

    public Movel(String nome, double preco, String categoria,
                 String material, double peso, double custoEntrega) {
        super(nome, preco, categoria);
        this.material = material;
        this.peso = peso;
        this.custoEntrega = custoEntrega;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCustoEntrega() {
        return custoEntrega;
    }

    public void setCustoEntrega(double custoEntrega) {
        this.custoEntrega = custoEntrega;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() + custoEntrega;
    }
}
