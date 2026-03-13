package exercicio6_formas_geometricas;

public class Trapezio extends Forma {

    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio(String cor, String nome, double dimensaoPrincipal,
                    double baseMaior, double baseMenor, double altura) {
        super(cor, nome, dimensaoPrincipal);
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}