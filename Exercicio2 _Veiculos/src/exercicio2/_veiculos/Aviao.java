package exercicio2._veiculos;

public class Aviao extends Veiculo {

    private int motores;
    private int capacidadePassageiros;
    private String companhia;
    
    public Aviao(String marca, String modelo, int ano, int motores, int capacidade,
            String companhia) {
        super(marca, modelo, ano);
        this.motores = motores;
        this.capacidadePassageiros = capacidadePassageiros;
        this.companhia = companhia;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    @Override
    public void mover() {
        System.out.println("O avião está voando no céu");
    }
}
