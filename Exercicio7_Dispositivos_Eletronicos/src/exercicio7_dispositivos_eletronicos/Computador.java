package exercicio7_dispositivos_eletronicos;

public class Computador extends Dispositivo {

    private String processador;
    private int memoriaRAM;
    private int armazenamento;

    public Computador(String marca, String modelo, double consumoEnergia,
                      String processador, int memoriaRAM, int armazenamento) {
        super(marca, modelo, consumoEnergia);
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public void ligar() {
        System.out.println("O computador está iniciando");
    }
}
