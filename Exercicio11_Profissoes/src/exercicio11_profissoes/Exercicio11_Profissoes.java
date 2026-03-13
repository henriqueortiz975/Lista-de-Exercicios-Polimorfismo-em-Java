package exercicio11_profissoes;

public class Exercicio11_Profissoes {

    public static void main(String[] args) {
        Profissao objM = new Medico("Carlos da silva", 15000, "Saúde", "Cardiologia", "Hospital Central", 10);
        Profissao objP = new Professor("Anabelle", 5000, "Educação", "Matemática", "Escola Estadual", 40);
        Profissao objE = new Engenheiro("Pedrinho", 12000, "Engenharia", "Civil", "Construtora ABC", 8);
        Profissao objAdvogado = new Advogado("Maria Moreis", 10000, "Direito", "Direito Penal", "Escritório Silva", 20);
        Profissao objArquiteto = new Arquiteto("Arthur veeck", 9000, "Arquitetura", "Urbanismo", "Studio Design", 12);

        objM.executarTrabalho();
        objP.executarTrabalho();
        objE.executarTrabalho();
        objAdvogado.executarTrabalho();
        objArquiteto.executarTrabalho();
    }
    
}
