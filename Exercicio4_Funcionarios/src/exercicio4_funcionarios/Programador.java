package exercicio4_funcionarios;

public class Programador extends Funcionario {

    private String linguagem;
    private String nivel;
    private boolean remoto;

    public Programador(String nome, double salario, String setor,
            String linguagem, String nivel, boolean remoto) {
        super(nome, salario, setor);
        this.linguagem = linguagem;
        this.nivel = nivel;
        this.remoto = remoto;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public boolean isRemoto() {
        return remoto;
    }

    public void setRemoto(boolean remoto) {
        this.remoto = remoto;
    }

    @Override
    public void trabalhar() {
        System.out.println("O programador está desenvolvendo software");
    }
}
