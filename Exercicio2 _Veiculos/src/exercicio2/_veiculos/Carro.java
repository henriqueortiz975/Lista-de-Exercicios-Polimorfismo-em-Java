package exercicio2._veiculos;

public class Carro extends Veiculo {

    private int portas;
    private String combustivel;
    private boolean automatico;
    
    public Carro(String marca, String modelo, int ano, int portas, String combustivel, boolean automatico){
        super(marca, modelo, ano);
        this.portas = portas;
        this.combustivel = combustivel;
        this.automatico = automatico;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    @Override
    public void mover() {
        System.out.println("O carro está andando na estrada");
    }
}
