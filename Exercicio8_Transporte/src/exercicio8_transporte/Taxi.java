package exercicio8_transporte;

public class Taxi extends Transporte {

    private double bandeirada;
    private double precoKm;
    private double distancia;

    public Taxi(String nome, int capacidade, String empresa,
                double bandeirada, double precoKm, double distancia) {
        super(nome, capacidade, empresa);
        this.bandeirada = bandeirada;
        this.precoKm = precoKm;
        this.distancia = distancia;
    }

    public double getBandeirada() {
        return bandeirada;
    }

    public void setBandeirada(double bandeirada) {
        this.bandeirada = bandeirada;
    }

    public double getPrecoKm() {
        return precoKm;
    }

    public void setPrecoKm(double precoKm) {
        this.precoKm = precoKm;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public double calcularTarifa() {
        return bandeirada + (precoKm * distancia);
    }
}
