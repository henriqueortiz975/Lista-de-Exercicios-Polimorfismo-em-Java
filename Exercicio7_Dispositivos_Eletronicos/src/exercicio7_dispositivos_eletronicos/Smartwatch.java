package exercicio7_dispositivos_eletronicos;

public class Smartwatch extends Dispositivo {

    private int tamanhoTela;
    private boolean monitorCardiaco;
    private boolean gps;

    public Smartwatch(String marca, String modelo, double consumoEnergia,
                      int tamanhoTela, boolean monitorCardiaco, boolean gps) {
        super(marca, modelo, consumoEnergia);
        this.tamanhoTela = tamanhoTela;
        this.monitorCardiaco = monitorCardiaco;
        this.gps = gps;
    }

    public int getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public boolean isMonitorCardiaco() {
        return monitorCardiaco;
    }

    public void setMonitorCardiaco(boolean monitorCardiaco) {
        this.monitorCardiaco = monitorCardiaco;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public void ligar() {
        System.out.println("O smartwatch está ligando");
    }
}
