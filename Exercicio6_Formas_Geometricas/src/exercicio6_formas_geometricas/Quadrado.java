package exercicio6_formas_geometricas;

public class Quadrado extends Forma {

    private double lado;
    private String tipo;
    private boolean preenchido;

    public Quadrado(String cor, String nome, double dimensaoPrincipal,
                    double lado, String tipo, boolean preenchido) {
        super(cor, nome, dimensaoPrincipal);
        this.lado = lado;
        this.tipo = tipo;
        this.preenchido = preenchido;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isPreenchido() {
        return preenchido;
    }

    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
