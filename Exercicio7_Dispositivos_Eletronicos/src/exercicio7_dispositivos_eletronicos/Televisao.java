package exercicio7_dispositivos_eletronicos;

public class Televisao extends Dispositivo {

    private int tamanhoPolegadas;
    private String resolucao;
    private boolean smart;

    public Televisao(String marca, String modelo, double consumoEnergia,
                     int tamanhoPolegadas, String resolucao, boolean smart) {
        super(marca, modelo, consumoEnergia);
        this.tamanhoPolegadas = tamanhoPolegadas;
        this.resolucao = resolucao;
        this.smart = smart;
    }

    public int getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public void setTamanhoPolegadas(int tamanhoPolegadas) {
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public void ligar() {
        System.out.println("A televisão está ligando");
    }
}
