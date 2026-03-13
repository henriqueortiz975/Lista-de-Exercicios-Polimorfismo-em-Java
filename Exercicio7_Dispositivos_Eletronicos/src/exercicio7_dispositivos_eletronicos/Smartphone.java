package exercicio7_dispositivos_eletronicos;

public class Smartphone extends Dispositivo {

    private int armazenamento;
    private int memoriaRAM;
    private boolean rede5g;

    public Smartphone(String marca, String modelo, double consumoEnergia,
                      int armazenamento, int memoriaRAM, boolean rede5g) {
        super(marca, modelo, consumoEnergia);
        this.armazenamento = armazenamento;
        this.memoriaRAM = memoriaRAM;
        this.rede5g = rede5g;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public boolean is5g() {
        return rede5g;
    }

    public void setrede5g(boolean rede5g) {
        this.rede5g = rede5g;
    }

    @Override
    public void ligar() {
        System.out.println("O smartphone está ligando");
    }
}
