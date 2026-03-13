package exercicio2._veiculos;

public class Moto extends Veiculo {

    private int cilindradas;
    private String tipo;
    private boolean temPartidaEletrica;
    
    public Moto(String marca, String modelo, int ano, int cilindradas, String tipo, boolean temPartidaEletrica) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
        this.tipo = tipo;
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void mover() {
        System.out.println("A moto está acelerando na estrada");
    }
}
