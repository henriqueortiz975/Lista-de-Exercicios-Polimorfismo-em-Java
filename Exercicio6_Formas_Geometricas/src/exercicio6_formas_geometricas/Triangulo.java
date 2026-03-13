package exercicio6_formas_geometricas;

public class Triangulo extends Forma {

    private double base;
    private double altura;
    private String tipo;

    public Triangulo(String cor, String nome, double dimensaoPrincipal,
                     double base, double altura, String tipo) {
        super(cor, nome, dimensaoPrincipal);
        this.base = base;
        this.altura = altura;
        this.tipo = tipo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
