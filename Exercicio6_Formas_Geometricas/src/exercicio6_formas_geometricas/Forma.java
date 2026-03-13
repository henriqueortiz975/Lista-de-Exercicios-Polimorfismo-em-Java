package exercicio6_formas_geometricas;

public class Forma {

    private String cor;
    private String nome;
    private double dimensaoPrincipal;

    public Forma(String cor, String nome, double dimensaoPrincipal) {
        this.cor = cor;
        this.nome = nome;
        this.dimensaoPrincipal = dimensaoPrincipal;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDimensaoPrincipal() {
        return dimensaoPrincipal;
    }

    public void setDimensaoPrincipal(double dimensaoPrincipal) {
        this.dimensaoPrincipal = dimensaoPrincipal;
    }

    public double calcularArea() {
        return 0;
    }
}
