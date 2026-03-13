package exercicio3_instrumentos_musicais;

public class Piano extends Instrumento {

    private int teclas;
    private String tipoPiano;
    private boolean digital;

    public Piano(String nome, String tipo, String fabricante,
            int teclas, String tipoPiano, boolean digital) {
        super(nome, tipo, fabricante);
        this.teclas = teclas;
        this.tipoPiano = tipoPiano;
        this.digital = digital;
    }

    public int getTeclas() {
        return teclas;
    }

    public void setTeclas(int teclas) {
        this.teclas = teclas;
    }

    public String getTipoPiano() {
        return tipoPiano;
    }

    public void setTipoPiano(String tipoPiano) {
        this.tipoPiano = tipoPiano;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    @Override
    public void tocar() {
        System.out.println("O piano está tocando");
    }
}
