package exercicio6_formas_geometricas;

public class Retangulo extends Forma {

    private double largura;
    private double altura;
    private boolean preenchido;

    public Retangulo(String cor, String nome, double dimensaoPrincipal,
                     double largura, double altura, boolean preenchido) {
        super(cor, nome, dimensaoPrincipal);
        this.largura = largura;
        this.altura = altura;
        this.preenchido = preenchido;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isPreenchido() {
        return preenchido;
    }

    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
