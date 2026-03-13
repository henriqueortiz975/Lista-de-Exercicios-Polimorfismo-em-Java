package exercicio4_funcionarios;

public class Designer extends Funcionario {

    private String ferramenta;
    private String especialidade;
    private boolean freelancer;

    public Designer(String nome, double salario, String setor, String ferramenta, String especialidade, boolean freelancer) {
        super(nome, salario, setor);
        this.ferramenta = ferramenta;
        this.especialidade = especialidade;
        this.freelancer = freelancer;
    }

    public String getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(String ferramenta) {
        this.ferramenta = ferramenta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isFreelancer() {
        return freelancer;
    }

    public void setFreelancer(boolean freelancer) {
        this.freelancer = freelancer;
    }

    @Override
    public void trabalhar() {
        System.out.println("O designer está criando layouts e artes");
    }
}
