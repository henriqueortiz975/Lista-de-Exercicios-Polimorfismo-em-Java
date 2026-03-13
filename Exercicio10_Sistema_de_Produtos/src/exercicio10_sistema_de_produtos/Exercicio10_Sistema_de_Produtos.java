package exercicio10_sistema_de_produtos;

public class Exercicio10_Sistema_de_Produtos {

    public static void main(String[] args) {
        Produto objL = new Livro("Java Básico", 100, "Livro", "Autor X", 300, true);
        Produto objE = new Eletronico("Notebook", 3000, "Eletrônico", "Dell", 12, 500);
        Produto objR = new Roupa("Camiseta", 80, "Roupa", "M", "Algodão", true);
        Produto objA = new Alimento("Chocolate", 10, "Alimento", "10/12/2026", 0.2, true);
        Produto objM = new Movel("Mesa", 500, "Móvel", "Madeira", 20, 100);

        System.out.println("Preço final Livro: " + objL.calcularPrecoFinal());
        System.out.println("Preço final Eletrônico: " + objE.calcularPrecoFinal());
        System.out.println("Preço final Roupa: " + objR.calcularPrecoFinal());
        System.out.println("Preço final Alimento: " + objA.calcularPrecoFinal());
        System.out.println("Preço final Móvel: " + objM.calcularPrecoFinal());

    }
    
}
