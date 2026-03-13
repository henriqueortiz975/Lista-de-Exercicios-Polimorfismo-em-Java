package exercicio8_transporte;

public class Metro extends Transporte {

    private int estacoes;
    private double tarifa;
    private boolean subterraneo;

    public Metro(String nome, int capacidade, String empresa,
                 int estacoes, double tarifa, boolean subterraneo) {
        super(nome, capacidade, empresa);
        this.estacoes = estacoes;
        this.tarifa = tarifa;
        this.subterraneo = subterraneo;
    }

    public int getEstacoes() {
        return estacoes;
    }

    public void setEstacoes(int estacoes) {
        this.estacoes = estacoes;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isSubterraneo() {
        return subterraneo;
    }

    public void setSubterraneo(boolean subterraneo) {
        this.subterraneo = subterraneo;
    }

    @Override
    public double calcularTarifa() {
        return tarifa;
    }
}
