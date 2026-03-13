package exercicio2._veiculos;

public class Barco extends Veiculo {

    private String tipo;
    private int capacidade;
    private boolean temMotor;
    
    public Barco(String marca, String modelo, int ano, String tipo, int capacidade, boolean temMotor) {
        super(marca, modelo, ano);
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.temMotor = temMotor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isTemMotor() {
        return temMotor;
    }

    public void setTemMotor(boolean temMotor) {
        this.temMotor = temMotor;
    }

    @Override
    public void mover() {
        System.out.println("O barco está navegando no mar");
    }
}
