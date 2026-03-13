package exercicio11_profissoes;

public class Medico extends Profissao {

    private String especialidade;
    private String hospital;
    private int anosExperiencia;

    public Medico(String nome, double salarioMedio, String area,
                  String especialidade, String hospital, int anosExperiencia) {
        super(nome, salarioMedio, area);
        this.especialidade = especialidade;
        this.hospital = hospital;
        this.anosExperiencia = anosExperiencia;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void executarTrabalho() {
        System.out.println("O medico esta atendendo pacientes");
    }
}
