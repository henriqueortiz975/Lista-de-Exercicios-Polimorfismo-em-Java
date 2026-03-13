package exercicio11_profissoes;

public class Arquiteto extends Profissao {

    private String especialidade;
    private String empresa;
    private int projetos;

    public Arquiteto(String nome, double salarioMedio, String area,
                     String especialidade, String empresa, int projetos) {
        super(nome, salarioMedio, area);
        this.especialidade = especialidade;
        this.empresa = empresa;
        this.projetos = projetos;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getProjetos() {
        return projetos;
    }

    public void setProjetos(int projetos) {
        this.projetos = projetos;
    }

    @Override
    public void executarTrabalho() {
        System.out.println("O arquiteto esta criando um projeto arquitetonico");
    }
}
