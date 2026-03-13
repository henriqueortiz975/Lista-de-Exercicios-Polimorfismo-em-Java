package exercicio8_transporte;

public class Uber extends Transporte {

    private double precoPorKm;
    private double distancia;
    private String categoria;

    public Uber(String nome, int capacidade, String empresa,
                double precoPorKm, double distancia, String categoria) {
        super(nome, capacidade, empresa);
        this.precoPorKm = precoPorKm;
        this.distancia = distancia;
        this.categoria = categoria;
    }

    public double getPrecoPorKm() {
        return precoPorKm;
    }

    public void setPrecoPorKm(double precoPorKm) {
        this.precoPorKm = precoPorKm;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public double calcularTarifa() {
        return precoPorKm * distancia;
    }
}
