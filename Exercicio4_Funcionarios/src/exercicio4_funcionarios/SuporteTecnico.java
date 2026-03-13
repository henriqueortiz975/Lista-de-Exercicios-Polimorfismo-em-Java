    package exercicio4_funcionarios;

public class SuporteTecnico extends Funcionario {

    private int chamados;
    private String area;
    private boolean plantao;

    public SuporteTecnico(String nome, double salario, String setor, int chamados, String area, boolean plantao) {
        super(nome, salario, setor);
        this.chamados = chamados;
        this.area = area;
        this.plantao = plantao;
    }

    public int getChamados() {
        return chamados;
    }

    public void setChamados(int chamados) {
        this.chamados = chamados;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isPlantao() {
        return plantao;
    }

    public void setPlantao(boolean plantao) {
        this.plantao = plantao;
    }

    @Override
    public void trabalhar() {
        System.out.println("O suporte técnico está resolvendo problemas de TI");
    }
}
