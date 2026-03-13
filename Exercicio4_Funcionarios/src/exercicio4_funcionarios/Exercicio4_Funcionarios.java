package exercicio4_funcionarios;

public class Exercicio4_Funcionarios {

    public static void main(String[] args) {
        Funcionario objgerenre = new Gerente("Carlos da Silva", 8000, "Administração", 10, "Senior", true);
        Funcionario objvendedor = new Vendedor("Ana Moreis", 3500, "Vendas", 50, 0.10, "Sul");
        Funcionario objprogramador= new Programador("Henrique Ibarra", 6000, "TI", "Java", "Pleno", true);
        Funcionario objdesigner = new Designer("Mara Ortiz", 4000, "Marketing", "Figma", "UI/UX", false);
        Funcionario objSTecnico = new SuporteTecnico("João veeck", 3000, "TI", 20, "Redes", true);

        objgerenre.trabalhar();
        objvendedor.trabalhar();
        objprogramador.trabalhar();
        objdesigner.trabalhar();
        objSTecnico.trabalhar();
    
    }
}
