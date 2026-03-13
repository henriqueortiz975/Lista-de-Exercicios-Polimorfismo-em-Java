package exercicio2._veiculos;

public class Bicicleta extends Veiculo {

    private int marchas;
    private String tipoFreio;
    private boolean eletrica;
    
    public Bicicleta(String marca, String modelo, int ano, int marchas,
            String tipoFreio, boolean eletrica) {
        super(marca, modelo, ano);
        this.marchas = marchas;
        this.tipoFreio = tipoFreio;
        this.eletrica = eletrica;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public boolean isEletrica() {
        return eletrica;
    }

    public void setEletrica(boolean eletrica) {
        this.eletrica = eletrica;
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta está sendo pedalada");
    }
}
