package exercicio8_transporte;

public class Trem extends Transporte {

    private int vagões;
    private double tarifa;
    private String tipo;

    public Trem(String nome, int capacidade, String empresa,
                int vagoes, double tarifa, String tipo) {
        super(nome, capacidade, empresa);
        this.vagões = vagoes;
        this.tarifa = tarifa;
        this.tipo = tipo;
    }

    public int getVagoes() {
        return vagões;
    }

    public void setVagoes(int vagoes) {
        this.vagões = vagoes;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularTarifa() {
        return tarifa;
    }
}
