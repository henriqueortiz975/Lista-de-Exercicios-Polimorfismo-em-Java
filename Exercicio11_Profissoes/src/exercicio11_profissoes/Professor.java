package exercicio11_profissoes;

public class Professor extends Profissao {

    private String disciplina;
    private String escola;
    private int cargaHoraria;

    public Professor(String nome, double salarioMedio, String area,
                     String disciplina, String escola, int cargaHoraria) {
        super(nome, salarioMedio, area);
        this.disciplina = disciplina;
        this.escola = escola;
        this.cargaHoraria = cargaHoraria;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public void executarTrabalho() {
        System.out.println("O professor esta dando aula");
    }
}
