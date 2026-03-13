package exercicio9_personagens_de_jogo;

public class Arqueiro extends Personagem {

    private int precisao;
    private String tipoArco;
    private int flechas;

    public Arqueiro(String nome, int nivel, int vida, int precisao, String tipoArco, int flechas) {
        super(nome, nivel, vida);
        this.precisao = precisao;
        this.tipoArco = tipoArco;
        this.flechas = flechas;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    public String getTipoArco() {
        return tipoArco;
    }

    public void setTipoArco(String tipoArco) {
        this.tipoArco = tipoArco;
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }

    @Override
    public void atacar() {
        System.out.println("O arqueiro lança uma flecha usando seua arco");
    }
}
