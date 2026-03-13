package exercicio3_instrumentos_musicais;

public class Bateria extends Instrumento {

    private int tambores;
    private String material;
    private boolean eletrica;

    public Bateria(String nome, String tipo, String fabricante, int tambores, String material, boolean eletrica) {
        super(nome, tipo, fabricante);
        this.tambores = tambores;
        this.material = material;
        this.eletrica = eletrica;
    }

    public int getTambores() {
        return tambores;
    }

    public void setTambores(int tambores) {
        this.tambores = tambores;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isEletrica() {
        return eletrica;
    }

    public void setEletrica(boolean eletrica) {
        this.eletrica = eletrica;
    }

    @Override
    public void tocar() {
        System.out.println("A bateria está tocando");
    }
}
