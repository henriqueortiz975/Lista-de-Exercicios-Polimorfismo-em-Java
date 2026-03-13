package exercicio11_profissoes;

public class Profissao {

    private String nome;
    private double salarioMedio;
    private String area;

    public Profissao(String nome, double salarioMedio, String area) {
        this.nome = nome;
        this.salarioMedio = salarioMedio;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioMedio() {
        return salarioMedio;
    }

    public void setSalarioMedio(double salarioMedio) {
        this.salarioMedio = salarioMedio;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void executarTrabalho() {
        System.out.println("O profissional esta executando seu trabalho");
    }
}
