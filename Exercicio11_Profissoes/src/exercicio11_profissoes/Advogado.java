package exercicio11_profissoes;

public class Advogado extends Profissao {

    private String areaDireito;
    private String escritorio;
    private int casos;

    public Advogado(String nome, double salarioMedio, String area,
                    String areaDireito, String escritorio, int casos) {
        super(nome, salarioMedio, area);
        this.areaDireito = areaDireito;
        this.escritorio = escritorio;
        this.casos = casos;
    }

    public String getAreaDireito() {
        return areaDireito;
    }

    public void setAreaDireito(String areaDireito) {
        this.areaDireito = areaDireito;
    }

    public String getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(String escritorio) {
        this.escritorio = escritorio;
    }

    public int getCasos() {
        return casos;
    }

    public void setCasos(int casos) {
        this.casos = casos;
    }

    @Override
    public void executarTrabalho() {
        System.out.println("O advogado esta defendendo um cliente");
    }
}
