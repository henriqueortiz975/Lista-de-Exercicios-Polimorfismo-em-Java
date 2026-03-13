package exercicio7_dispositivos_eletronicos;

public class Tablet extends Dispositivo {

    private int tamanhoTela;
    private int armazenamento;
    private boolean canetaDigital;

    public Tablet(String marca, String modelo, double consumoEnergia,
                  int tamanhoTela, int armazenamento, boolean canetaDigital) {
        super(marca, modelo, consumoEnergia);
        this.tamanhoTela = tamanhoTela;
        this.armazenamento = armazenamento;
        this.canetaDigital = canetaDigital;
    }

    public int getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean isCanetaDigital() {
        return canetaDigital;
    }

    public void setCanetaDigital(boolean canetaDigital) {
        this.canetaDigital = canetaDigital;
    }

    @Override
    public void ligar() {
        System.out.println("O tablet está ligando");
    }
}
