package exercicio10_sistema_de_produtos;

public class Eletronico extends Produto {

    private String marca;
    private int garantiaMeses;
    private double imposto;

    public Eletronico(String nome, double preco, String categoria,
                      String marca, int garantiaMeses, double imposto) {
        super(nome, preco, categoria);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
        this.imposto = imposto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() + imposto;
    }
}
