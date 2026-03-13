package exercicio10_sistema_de_produtos;

public class Roupa extends Produto {

    private String tamanho;
    private String material;
    private boolean promocao;

    public Roupa(String nome, double preco, String categoria,
                 String tamanho, String material, boolean promocao) {
        super(nome, preco, categoria);
        this.tamanho = tamanho;
        this.material = material;
        this.promocao = promocao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    @Override
    public double calcularPrecoFinal() {
        if (promocao) {
            return getPreco() * 0.80; 
        }
        return getPreco();
    }
}
