package exercicio6_formas_geometricas;

public class Circulo extends Forma {

    private double raio;
    private double diametro;
    private boolean preenchido;

    public Circulo(String cor, String nome, double dimensaoPrincipal,
                   double raio, double diametro, boolean preenchido) {
        super(cor, nome, dimensaoPrincipal);
        this.raio = raio;
        this.diametro = diametro;
        this.preenchido = preenchido;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public boolean isPreenchido() {
        return preenchido;
    }

    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
