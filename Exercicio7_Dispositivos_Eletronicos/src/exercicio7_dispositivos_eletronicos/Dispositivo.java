package exercicio7_dispositivos_eletronicos;

public class Dispositivo {

    private String marca;
    private String modelo;
    private double consumoEnergia;

    public Dispositivo(String marca, String modelo, double consumoEnergia) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumoEnergia = consumoEnergia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public void ligar() {
        System.out.println("O dispositivo está ligando");
    }
}
